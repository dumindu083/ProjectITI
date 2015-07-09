/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
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

    public void showWindow(JFrame windowToDispose, JFrame windowToOpen) {

        if (windowToOpen == null || windowToDispose == null) {
            System.err.println("Mention the corresponding windows to open");
        } else {
            windowToDispose.dispose();
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
        JOptionPane.showMessageDialog(null, message, window.getTitle(), JOptionPane.ERROR_MESSAGE);
    }
    
    public void showFeedback(JFrame window, String message){
        JOptionPane.showMessageDialog(window, message, window.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int showConfirm(JFrame window, String message){
        return JOptionPane.showConfirmDialog(null, message, window.getTitle(),JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

}
