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
public class LessonActivityTest {
    
    public LessonActivityTest() {
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
     * Test of getActivityID method, of class LessonActivity.
     */
    @Test
    public void testGetActivityID() {
        System.out.println("getActivityID");
        LessonActivity instance = new LessonActivity();
        String expResult = "2";
        String result = instance.getActivityID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivityID method, of class LessonActivity.
     */
    @Test
    public void testSetActivityID() {
        System.out.println("setActivityID");
        String activityID = "2";
        LessonActivity instance = new LessonActivity();
        instance.setActivityID(activityID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityTitle method, of class LessonActivity.
     */
    @Test
    public void testGetActivityTitle() {
        System.out.println("getActivityTitle");
        LessonActivity instance = new LessonActivity();
        String expResult = "";
        String result = instance.getActivityTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivityTitle method, of class LessonActivity.
     */
    @Test
    public void testSetActivityTitle() {
        System.out.println("setActivityTitle");
        String activityTitle = "";
        LessonActivity instance = new LessonActivity();
        instance.setActivityTitle(activityTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassingScore method, of class LessonActivity.
     */
    @Test
    public void testGetPassingScore() {
        System.out.println("getPassingScore");
        LessonActivity instance = new LessonActivity();
        String expResult = "";
        String result = instance.getPassingScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassingScore method, of class LessonActivity.
     */
    @Test
    public void testSetPassingScore() {
        System.out.println("setPassingScore");
        String PassingScore = "";
        LessonActivity instance = new LessonActivity();
        instance.setPassingScore(PassingScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBolsToPlay method, of class LessonActivity.
     */
    @Test
    public void testGetBolsToPlay() {
        System.out.println("getBolsToPlay");
        LessonActivity instance = new LessonActivity();
        String[] expResult = null;
        String[] result = instance.getBolsToPlay();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBolsToPlay method, of class LessonActivity.
     */
    @Test
    public void testSetBolsToPlay() {
        System.out.println("setBolsToPlay");
        String[] BolsToPlay = new String[10];
        LessonActivity instance = new LessonActivity();
        instance.setBolsToPlay(BolsToPlay);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityData method, of class LessonActivity.
     */
    @Test
    public void testGetActivityData() {
        System.out.println("getActivityData");
        LessonActivity lessonActivity = null;
        String ActivityID = "2";
        LessonActivity instance = new LessonActivity();
        instance.setActivityID(ActivityID);
        
        instance.getActivityData(lessonActivity, ActivityID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
