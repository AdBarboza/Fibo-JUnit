/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.fibo_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián
 */
public class FibonacciTest {
    
    Fibonacci fibo;
    
    public FibonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       fibo = new Fibonacci();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of succession method, of class Fibonacci.
     */
    @Test
    public void testSuccessionSpeciaCaseCero() {
        int n = 0;
        int expResult = 0;
        int result = fibo.succession(n);
        assertEquals(expResult, result);
        
        System.out.println("Succession on CaseCero");
    }
    @Test
    public void testSuccessionSpeciaCaseOne() {
        int n = 1;
        int expResult = 1;
        int result = fibo.succession(n);
        
        assertEquals(expResult, result);
        System.out.println("Succession on CaseOne");
    }
    @Test
    public void testSuccessionSpeciaCaseNegative() {
        int n = -15;
        int expResult = -1;
        int result = fibo.succession(n);
        
        assertEquals(expResult, result);
        System.out.println("Succession on Case Negative");
    }
    
    @Test
    public void testSuccessionResult1() {
        int n = 4;
        int expResult = 3;
        int result = fibo.succession(n);
        
        assertEquals(expResult, result);
        System.out.println("Succession on Case Result1");
    }
    
    @Test
    public void testSuccessionResult2() {
        int n = 8;
        int expResult = 21;
        int result = fibo.succession(n);
        
        assertEquals(expResult, result);
        System.out.println("Succession on Case Result1");
    }
    
}
