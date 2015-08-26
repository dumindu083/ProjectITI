/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import javax.swing.JComboBox;
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
public class ValidatorTest {
    
    public ValidatorTest() {
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
     * Test of validateEmail method, of class Validator.
     */
    @Test
    public void testValidateEmail() {
        System.out.println("validateEmail");
        String email = "lsici.lk"; //provide the test String here
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.validateEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Validator.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String text = "";
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.isEmpty(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of containsApo method, of class Validator.
     */
    @Test
    public void testContainsApo() {
        System.out.println("containsApo");
        String text = "uy'siw";
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.containsApo(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of isMatching method, of class Validator.
     */
    @Test
    public void testIsMatching() {
        System.out.println("isMatching");
        char[] password = "helpme".toCharArray();
        char[] confirmPassword = "icanhelp".toCharArray();
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isMatching(password, confirmPassword);
        assertEquals(expResult, result);
    }

    /**
     * Test of isItemSelected method, of class Validator.
     */
    @Test
    public void testIsItemSelected() {
        System.out.println("isItemSelected");
        JComboBox comboBoxName = new JComboBox();
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isItemSelected(comboBoxName);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNumeric method, of class Validator.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String number = "89gth";
        Validator instance = new Validator();
        boolean expResult = false;
        boolean result = instance.isNumeric(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of isWithinRange method, of class Validator.
     */
    @Test
    public void testIsWithinRange() {
        System.out.println("isWithinRange");
        String number = "138";
        int min = 20;
        int max = 200;
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.isWithinRange(number, min, max);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasEnoughChar method, of class Validator.
     */
    @Test
    public void testHasEnoughChar() {
        System.out.println("hasEnoughChar");
        String text = "5#72hd";
        int length = 6;
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.hasEnoughChar(text, length);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifyAdmin method, of class Validator.
     */
    @Test
    public void testVerifyAdmin() {
        System.out.println("verifyAdmin");
        String username = "admin";
        String password = "admin@iti";
        Validator instance = new Validator();
        boolean expResult = true;
        boolean result = instance.verifyAdmin(username, password);
        assertEquals(expResult, result);
    }
    
}
