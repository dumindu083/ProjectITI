/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import com.mysql.jdbc.ResultSetImpl;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.ResultSet;
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
public class DBConnectionTest {
    
    public DBConnectionTest() {
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
     * Test of getInstance method, of class DBConnection.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DBConnection expResult = DBConnection.getInstance();
        DBConnection result = DBConnection.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
}

    
    /**
     * Test of getValues method, of class DBConnection.
     */
    @Test
    public void testGetValues() throws Exception {
        System.out.println("getValues");
        String query = "SELECT * FROM student";
        DBConnection instance = DBConnection.getInstance();
        ResultSet expResult = null;
        ResultSet result = instance.getValues(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertValues method, of class DBConnection.
     */
    @Test
    public void testInsertValues() throws Exception {
        System.out.println("insertValues");
        String query = "UPDATE admin SET FirstName = 'Makal' WHERE ADMIN_ID = 1;";
        DBConnection instance = DBConnection.getInstance();
        instance.insertValues(query);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
