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
public class JUnitTestGST {
    
    public JUnitTestGST() {
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
    public void GSTTest() {
        Sales sales = new Sales();
        double output = sales.GST(60000);
        assertEquals(63600, output, 0.06);
    }
}
