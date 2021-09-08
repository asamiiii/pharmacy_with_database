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
public class BuyTest {
    
    public BuyTest() {
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
     * Test of Subtract method, of class Buy.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        int Amount1 = 10;
        int Amount2 = 2;
        int expResult = 8;
        int result = Buy.Subtract(Amount1, Amount2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSubtract2() {
        System.out.println("Subtract");
        int Amount1 = 2;    // Amount in database 
        int Amount2 = 10;   // Amount from user
        int expResult = -8;
        int result = Buy.Subtract(Amount1, Amount2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSubtract3() {
        System.out.println("Subtract3");
        int Amount1 = 10;    // Amount in database 
        int Amount2 = 0;   // Amount from user
        int expResult = 10;
        int result = Buy.Subtract(Amount1, Amount2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiply method, of class Buy.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        float price = 5;
        int Amount = 2;
        float expResult = 10;
        float result = Buy.Multiply(price, Amount);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMultiply2() {
        System.out.println("Multiply");
        float price = 5;
        int Amount = 0;
        float expResult = 0;
        float result = Buy.Multiply(price, Amount);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of main method, of class Buy.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Buy.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
