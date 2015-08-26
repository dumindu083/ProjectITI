/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import javax.swing.JDialog;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class UIEnhancementsTest {
    
    public UIEnhancementsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setIcon method, of class UIEnhancements.
     */
    @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        String imageName = "";
        JFrame jFrame = null;
        UIEnhancements instance = new UIEnhancements();
        instance.setIcon(imageName, jFrame);

    }

    /**
     * Test of showWindow method, of class UIEnhancements.
     */
    @Test
    public void testShowWindow_JFrame_JFrame() {
        System.out.println("showWindow");
        JFrame windowToDispose = null;
        JFrame windowToOpen = null;
        UIEnhancements instance = new UIEnhancements();
        instance.showWindow(windowToDispose, windowToOpen);
        
    }

    /**
     * Test of showWindow method, of class UIEnhancements.
     */
    @Test
    public void testShowWindow_JFrame() {
        System.out.println("showWindow");
        JFrame windowToOpen = null;
        UIEnhancements instance = new UIEnhancements();
        instance.showWindow(windowToOpen);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
    }

    /**
     * Test of showDialog method, of class UIEnhancements.
     */
    @Test
    public void testShowDialog() {
        System.out.println("showDialog");
        JDialog windowToOpen = null;
        UIEnhancements instance = new UIEnhancements();
        instance.showDialog(windowToOpen);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
    }

    /**
     * Test of showAboutUs method, of class UIEnhancements.
     */
    @Test
    public void testShowAboutUs() {
        System.out.println("showAboutUs");
        JFrame container = null;
        UIEnhancements instance = new UIEnhancements();
        instance.showAboutUs(container);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
    }

    /**
     * Test of showWarning method, of class UIEnhancements.
     */
    @Test
    public void testShowWarning() {
        System.out.println("showWarning");
        JFrame window = null;
        String message = "";
        UIEnhancements instance = new UIEnhancements();
        instance.showWarning(window, message);

    }

    /**
     * Test of showError method, of class UIEnhancements.
     */
    @Test
    public void testShowError() {
        System.out.println("showError");
        JFrame window = null;
        String message = "";
        UIEnhancements instance = new UIEnhancements();
        instance.showError(window, message);
    }

    /**
     * Test of showFeedback method, of class UIEnhancements.
     */
    @Test
    public void testShowFeedback() {
        System.out.println("showFeedback");
        JFrame window = null;
        String message = "";
        UIEnhancements instance = new UIEnhancements();
        instance.showFeedback(window, message);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of showConfirm method, of class UIEnhancements.
     */
    @Test
    public void testShowConfirm() {
        System.out.println("showConfirm");
        JFrame window = null;
        String message = "";
        UIEnhancements instance = new UIEnhancements();
        int expResult = 0;
        int result = instance.showConfirm(window, message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of showAdminDialog method, of class UIEnhancements.
     */
    @Test
    public void testShowAdminDialog() {
        System.out.println("showAdminDialog");
        JFrame parent = null;
        UIEnhancements instance = new UIEnhancements();
        JFrame expResult = null;
        JFrame result = instance.showAdminDialog(parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of openVideo method, of class UIEnhancements.
     */
    @Test
    public void testOpenVideo() {
        System.out.println("openVideo");
        String filename = "";
        JDialog dialog = null;
        UIEnhancements instance = new UIEnhancements();
        instance.openVideo(filename, dialog);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of goBackTwice method, of class UIEnhancements.
     */
    @Test
    public void testGoBackTwice() {
        System.out.println("goBackTwice");
        JDialog currentDialog = null;
        JDialog underlyingDialog = null;
        UIEnhancements instance = new UIEnhancements();
        instance.goBackTwice(currentDialog, underlyingDialog);
        
    }
    
}
