/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0734733_akashdeep_mad5234_test2_question1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akashdeep Singh
 */
public class TTCTest {
    TTC ttc;
        
    
    public TTCTest() {
         ttc = new TTC();
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
     * Test of calculateTotal method, of class TTC.
     */
    @Test
    public void testCalculateTotal() {
         
    }
    
        // requirement 1

        @Test
    public void test1() {
         
      String[] from = {"Leslie"};
        String[] to = {"Don Mills"};
        double result = ttc.calculateTotal(from,to);
        assertEquals(2.50, result,0.0);
    }
    
    
    // requirement 2
         @Test
    public void test2() {
         
      String[] from = {"Sheppard"};
        String[] to = {"Finch"};
        double result = ttc.calculateTotal(from,to);
        assertEquals(3.00, result,0.0);
    }
    

    
    
}
