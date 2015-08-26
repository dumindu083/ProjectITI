/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getBasicLessonStat method, of class Student.
     */
    @Test
    public void testGetBasicLessonStat() {
        System.out.println("getBasicLessonStat");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getBasicLessonStat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBasicLessonStat method, of class Student.
     */
    @Test
    public void testSetBasicLessonStat() {
        System.out.println("setBasicLessonStat");
        String BasicLessonStat = "";
        Student instance = new Student();
        instance.setBasicLessonStat(BasicLessonStat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateRegistred method, of class Student.
     */
    @Test
    public void testGetDateRegistred() {
        System.out.println("getDateRegistred");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getDateRegistred();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateRegistred method, of class Student.
     */
    @Test
    public void testSetDateRegistred() {
        System.out.println("setDateRegistred");
        String DateRegistred = "";
        Student instance = new Student();
        instance.setDateRegistred(DateRegistred);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriorExpereince method, of class Student.
     */
    @Test
    public void testGetPriorExpereince() {
        System.out.println("getPriorExpereince");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPriorExpereince();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriorExpereince method, of class Student.
     */
    @Test
    public void testSetPriorExpereince() {
        System.out.println("setPriorExpereince");
        String PriorExpereince = "";
        Student instance = new Student();
        instance.setPriorExpereince(PriorExpereince);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfLessonsCovered method, of class Student.
     */
    @Test
    public void testGetNumberOfLessonsCovered() {
        System.out.println("getNumberOfLessonsCovered");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getNumberOfLessonsCovered();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfLessonsCovered method, of class Student.
     */
    @Test
    public void testSetNumberOfLessonsCovered() {
        System.out.println("setNumberOfLessonsCovered");
        int NumberOfLessonsCovered = 0;
        Student instance = new Student();
        instance.setNumberOfLessonsCovered(NumberOfLessonsCovered);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentLesson method, of class Student.
     */
    @Test
    public void testGetCurrentLesson() {
        System.out.println("getCurrentLesson");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getCurrentLesson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentLesson method, of class Student.
     */
    @Test
    public void testSetCurrentLesson() {
        System.out.println("setCurrentLesson");
        int CurrentLesson = 0;
        Student instance = new Student();
        instance.setCurrentLesson(CurrentLesson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findStudentByID method, of class Student.
     */
    @Test
    public void testFindStudentByID() {
        System.out.println("findStudentByID");
        Student student = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.findStudentByID(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudentBasics method, of class Student.
     */
    @Test
    public void testUpdateStudentBasics() {
        System.out.println("updateStudentBasics");
        Student student = null;
        Student instance = new Student();
        instance.updateStudentBasics(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudentCurrentLesson method, of class Student.
     */
    @Test
    public void testUpdateStudentCurrentLesson() {
        System.out.println("updateStudentCurrentLesson");
        Student student = null;
        Student instance = new Student();
        instance.updateStudentCurrentLesson(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
