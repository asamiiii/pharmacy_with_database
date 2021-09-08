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
public class GUITest {
    
    public GUITest() {
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
     * Test of Check_Login method, of class GUI.
     */
    @Test
    public void testCheck_Login() 
    {
        System.out.println("Check_Login");
        String user_name = "asamii";
        String password = "123";
        GUI instance = new GUI();
        boolean expResult = true;
        boolean result = instance.Check_Login(user_name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheck_Login1() 
    {
        System.out.println("Check_Login1");
        String user_name = "sami";
        String password = "12345";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.Check_Login(user_name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    @Test
    public void testCheck_Login2() {
        System.out.println("Check_Login2");
        String user_name = "";
        String password = "";
        GUI instance = new GUI();
        boolean expResult = false;
        boolean result = instance.Check_Login(user_name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class GUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
