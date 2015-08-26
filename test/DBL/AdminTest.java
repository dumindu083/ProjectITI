/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of getUserID method, of class Admin.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserID method, of class Admin.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String UserID = "";
        Admin instance = new Admin();
        instance.setUserID(UserID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Admin.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Admin.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "";
        Admin instance = new Admin();
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Admin.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Admin.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String LastName = "";
        Admin instance = new Admin();
        instance.setLastName(LastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Admin.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Admin.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String Gender = "";
        Admin instance = new Admin();
        instance.setGender(Gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Admin.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Admin.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        Admin instance = new Admin();
        instance.setUsername(Username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Admin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Admin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        Admin instance = new Admin();
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Admin.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Admin.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Admin instance = new Admin();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginITI method, of class Admin.
     */
    @Test
    public void testLoginITI_Admin_String() {
        System.out.println("loginITI");
        Admin admin = null;
        String person = "";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.loginITI(admin, person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginITI method, of class Admin.
     */
    @Test
    public void testLoginITI_Student_String() {
        System.out.println("loginITI");
        Student student = null;
        String person = "";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.loginITI(student, person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerITI method, of class Admin.
     */
    @Test
    public void testRegisterITI_Admin_JFrame() {
        System.out.println("registerITI");
        Admin admin = null;
        JFrame window = null;
        Admin instance = new Admin();
        instance.registerITI(admin, window);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerITI method, of class Admin.
     */
    @Test
    public void testRegisterITI_Student_JFrame() {
        System.out.println("registerITI");
        Student student = null;
        JFrame window = null;
        Admin instance = new Admin();
        instance.registerITI(student, window);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class Admin.
     */
    @Test
    public void testUpdateAccount_Admin_JFrame() {
        System.out.println("updateAccount");
        Admin admin = null;
        JFrame window = null;
        Admin instance = new Admin();
        instance.updateAccount(admin, window);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class Admin.
     */
    @Test
    public void testUpdateAccount_Student_JFrame() {
        System.out.println("updateAccount");
        Student student = null;
        JFrame window = null;
        Admin instance = new Admin();
        instance.updateAccount(student, window);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logoutITI method, of class Admin.
     */
    @Test
    public void testLogoutITI() {
        System.out.println("logoutITI");
        JFrame currentWindow = null;
        JFrame underlyingWindow = null;
        JFrame loginWindow = null;
        Admin instance = new Admin();
        instance.logoutITI(currentWindow, underlyingWindow, loginWindow);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasUsername method, of class Admin.
     */
    @Test
    public void testHasUsername() {
        System.out.println("hasUsername");
        String Username = "";
        String tableName = "";
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.hasUsername(Username, tableName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
