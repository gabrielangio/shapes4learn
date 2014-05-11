/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.maimonides.multimedia.shapes4learn.lexico;

import edu.maimonides.multimedia.shapes4learn.model.ShapeAmbient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LexicoTest {
    
    public LexicoTest() {
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
     * Test of interpret method, of class Lexico.
     * @throws java.lang.Exception
     */
    
    @Test
    public void TestCorrecto1() throws Exception {
        System.out.println("codigo correcto test1");
        String code1 = "set circle mundo";
        ShapeAmbient ambient1 = null;
        Lexico instance1 = new Lexico();
        instance1.interpret(code1, ambient1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test    
    public void TestCorrecto2() throws Exception {
        System.out.println("codigo correcto test2");
        String code2 = "in #11A3E2 123 *";
        ShapeAmbient ambient2 = null;
        Lexico instance2 = new Lexico();
        instance2.interpret(code2, ambient2);
    }
    
    @Test    
    public void TestCorrecto3() throws Exception {
        System.out.println("codigo correcto test3");
        String code3 = "- * / ( )";
        ShapeAmbient ambient3 = null;
        Lexico instance3 = new Lexico();
        instance3.interpret(code3, ambient3);
    }
   
    @Test
    public void TestIncorrecto1() throws Exception {
        System.out.println("codigo incorrecto test1");
        String codeIncorrect1 = "15dc14 #a*g";
        ShapeAmbient ambientIncorrect1 = null;
        Lexico instanceIncorrect1 = new Lexico();
        instanceIncorrect1.interpret(codeIncorrect1, ambientIncorrect1);
    }

    @Test
    public void TestIncorrecto2() throws Exception {
        System.out.println("codigo incorrecto test2");
        String codeIncorrect2 = "#ff44ac87 [hola";
        ShapeAmbient ambientIncorrect2 = null;
        Lexico instanceIncorrect2 = new Lexico();
        instanceIncorrect2.interpret(codeIncorrect2, ambientIncorrect2);
    }

}