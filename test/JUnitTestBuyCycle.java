/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import safeautogalore.Sales;

/**
 *
 * @author Brooke Baldwin
 */
public class JUnitTestBuyCycle {
    
    public JUnitTestBuyCycle() {
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

    
    @Test
    public void testBuyCycle() {
        Sales sales = new Sales();
        int output = sales.BuyCycle(60000,70000);
        assertEquals(10000, output);
    }
}
