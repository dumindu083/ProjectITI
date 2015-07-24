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

/**
 *
 * @author hp
 */
public class UIEnhancements {

    public void setIcon(String imageName, JFrame jFrame) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(this.getClass().getResource(imageName));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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
     * Displays the JFrame mentioned as windowToOpen
     *
     * @param windowToOpen
     */
    public void showWindow(JFrame windowToOpen) {

        if (windowToOpen == null) {
            System.err.println("Mention the corresponding windows to open");
        } else {
            windowToOpen.setVisible(true);

        }

    }
    public void showDialog(JDialog windowToOpen) {
        
        
        if (windowToOpen == null) {
            System.err.println("Mention the corresponding windows to open");
        } else {
            windowToOpen.setVisible(true);

        }

    }

    public void showAboutUs(JFrame container) {

        About about = new About(container, true);
        about.setVisible(true);
    }

    public void showWarning(JFrame window, String message) {
        JOptionPane.showMessageDialog(null, message, window.getTitle(), JOptionPane.WARNING_MESSAGE);
    }

    public void showError(JFrame window, String message) {
        if (window == null) {
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, window.getTitle(), JOptionPane.ERROR_MESSAGE);
        }

    }

    public void showFeedback(JFrame window, String message) {
        JOptionPane.showMessageDialog(window, message, window.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }

    public int showConfirm(JFrame window, String message) {
        return JOptionPane.showConfirmDialog(null, message, window.getTitle(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
        }
        
    }

}
