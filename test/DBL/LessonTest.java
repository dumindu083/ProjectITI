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
public class LessonTest {
    
    public LessonTest() {
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
     * Test of getLessonNo method, of class Lesson.
     */
    @Test
    public void testGetLessonNo() {
        System.out.println("getLessonNo");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getLessonNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setLessonNo method, of class Lesson.
     */
    @Test
    public void testSetLessonNo() {
        System.out.println("setLessonNo");
        String lessonNo = "1";
        Lesson instance = new Lesson();
        instance.setLessonNo(lessonNo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Lesson.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Lesson.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Lesson instance = new Lesson();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Lesson.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Lesson.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "";
        Lesson instance = new Lesson();
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getAksharas method, of class Lesson.
     */
    @Test
    public void testGetAksharas() {
        System.out.println("getAksharas");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getAksharas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setAksharas method, of class Lesson.
     */
    @Test
    public void testSetAksharas() {
        System.out.println("setAksharas");
        String Aksharas = "";
        Lesson instance = new Lesson();
        instance.setAksharas(Aksharas);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayAreas method, of class Lesson.
     */
    @Test
    public void testGetPlayAreas() {
        System.out.println("getPlayAreas");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getPlayAreas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayAreas method, of class Lesson.
     */
    @Test
    public void testSetPlayAreas() {
        System.out.println("setPlayAreas");
        String PlayAreas = "";
        Lesson instance = new Lesson();
        instance.setPlayAreas(PlayAreas);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayingFingers method, of class Lesson.
     */
    @Test
    public void testGetPlayingFingers() {
        System.out.println("getPlayingFingers");
        Lesson instance = new Lesson();
        String expResult = null;
        String result = instance.getPlayingFingers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayingFingers method, of class Lesson.
     */
    @Test
    public void testSetPlayingFingers() {
        System.out.println("setPlayingFingers");
        String playingFingers = null;
        Lesson instance = new Lesson();
        instance.setPlayingFingers(playingFingers);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }


    /**
     * Test of getImageData method, of class Lesson.
     */
    @Test
    public void testGetImageData() {
        System.out.println("getImageData");
        Lesson instance = new Lesson();
        byte[] expResult = null;
        byte[] result = instance.getImageData();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setImageData method, of class Lesson.
     */
    @Test
    public void testSetImageData() {
        System.out.println("setImageData");
        byte[] ImageData = null;
        Lesson instance = new Lesson();
        instance.setImageData(ImageData);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessonData method, of class Lesson.
     */
    @Test
    public void testGetLessonData_Lesson_String() {
        System.out.println("getLessonData");
        Lesson lesson = new Lesson();
        String LessonID = "1";
        Lesson instance = new Lesson();
        instance.getLessonData(lesson, LessonID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLessonData method, of class Lesson.
     */
    @Test
    public void testGetLessonData_BLesson_String() {
        System.out.println("getLessonData");
        BLesson bLesson = new BLesson();
        String LessonID = "1";
        Lesson instance = new Lesson();
        instance.getLessonData(bLesson, LessonID);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
