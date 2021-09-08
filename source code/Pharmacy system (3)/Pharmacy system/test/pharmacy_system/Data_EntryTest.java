/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M.A.S tech
 */
public class Data_EntryTest {
    
    public Data_EntryTest() {
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
     * Test of Add method, of class Data_Entry.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int Amount1 = 1;
        int Amount2 = 11;
        int expResult = 12;
        int result = Data_Entry.Add(Amount1,Amount2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd2() {
        System.out.println("Add2");
        int Amount1 = 1;
        int Amount2 = 0;
        int expResult = 1;
        int result = Data_Entry.Add(Amount1,Amount2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Data_Entry.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Data_Entry.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
