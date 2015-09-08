/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import java.awt.Desktop;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
/**
 *
 * @author hp
 */
public class UIEnhancements {
    
    final static private Logger logger = Logger.getLogger(UIEnhancements.class);

    /**
     * Sets the icon of a window as the logo of the ITI.
     * @param jFrame window to be set the icon
     */
    public void setIcon(JFrame jFrame) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(this.getClass().getResource("tablaIcon.png"));

        } catch (IOException ex) {
            logger.error("Error in finding the logo of the ITI", ex);
        }
        jFrame.setIconImage(image);
    }

    /**
     * Displays the JFrame mentioned as windowToOpen and disposes the window
     * mentioned as windowToDispose
     *
     * @param windowToDispose
     * @param windowToOpen
     */
    public void showWindow(JFrame windowToDispose, JFrame windowToOpen) {

        if (windowToOpen == null || windowToDispose == null) {
            System.err.println("Mention the corresponding windows to open");
        } else {
            windowToDispose.dispose();
            windowToOpen.setVisible(true);
        }

    }

    /**
     * Displays the JFrame mentioned as windowToOpen, without disposing any of the underlying windows
     *
     * @param windowToOpen
     */
    public void showWindow(JFrame windowToOpen) {

        if (windowToOpen == null) {
            showError(null, "Mention the corresponding windows to open");
        } else {
            windowToOpen.setVisible(true);
        }
    }
    
    public void showDialog(JDialog windowToOpen) {
        
        if (windowToOpen == null) {
            System.err.println("Mention the window to open");
        } else {
            windowToOpen.setVisible(true);
        }
    }

    public void showAboutUs(JFrame container) {

        About about = new About(container, true);
        about.setVisible(true);
    }

    /**Pops up a wanning message on the interface. if the window is null this'll show a standard warning message titled
     * "Caution"
     *
     * @param window is the window on which the message is displayed.
     * @param message is the text to be appeared in the message.
     */
    public void showWarning(JFrame window, String message) {
        if (window == null) {
            JOptionPane.showMessageDialog(null, message, "Caution", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, window.getTitle(), JOptionPane.WARNING_MESSAGE);
        }
    }

    
    /**Pops up an error message on the interface. if the window is null this'll show a standard error message titled
     * "Error"
     *
     * @param window is the window on which the message is displayed.
     * @param message is the text to be appeared in the message.
     */
    public void showError(JFrame window, String message) {
        if (window == null) {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, window.getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *  Shows an information message on the interface about the current status of the operation in which this is invoked. 
     * if the window is null this'll show a standard warning message titled "Information"
     * 
     * 
     * @param window is the window on which the message is displayed.
     * @param message is the text to be appeared in the message.
     */
    public void showFeedback(JFrame window, String message) {
        if (window == null) {
            JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(window, message, window.getTitle(), JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     *  Shows an confirmation message on the interface to get the user response on particular operation.
     *  if the window is null this'll show a standard warning message titled "Confirmation". 
     *  Returns 0 if the response is "Yes" or else 1 response is "No"
     * 
     * 
     * @param window is the window on which the message is displayed.
     * @param message is the text to be appeared in the message.
     */
    
    public int showConfirm(JFrame window, String message) {
        
        if (window == null) {
            return JOptionPane.showConfirmDialog(null, message, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } else {
            return JOptionPane.showConfirmDialog(null, message, window.getTitle(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        
    }
    
    
    

    public JFrame showAdminDialog(JFrame parent) {

        AdminVerification av = new AdminVerification(parent, true);

        av.setVisible(true);
        return parent;
    }
    
    public void openVideo(String filename, JDialog dialog){
        
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(filename));
        } catch (IOException ex) {
            this.showError((JFrame) dialog.getParent(), "Error in openning file");
            logger.error("Error occured while opernning video file");
        }
    }
    
    public void goBackTwice(JDialog currentDialog, JDialog underlyingDialog){
        
        currentDialog.setVisible(false);
        underlyingDialog.setVisible(false);
    }

}
