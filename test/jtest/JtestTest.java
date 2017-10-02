/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Suhruth
 */
public class JtestTest {
    
    public JtestTest() {
    }
    @Test
    public void testAddNum() {
      
        int a = 5;
        int b = 6;
        Jtest instance = new Jtest();
        int expResult = 11;
        int result = instance.addNum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testAddStr() {
        
        String a = "Suhruth";
        String b = "b4";
        Jtest instance = new Jtest();
        String expResult = "Suhruthb4";
        String result = instance.addStr(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
