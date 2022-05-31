package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aug
 */
public class calcIMCTest {
    
    public calcIMCTest() {
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
     * Test of IMC method, of class calcIMC.
     */
    @Test
    public void testImc() {
        System.out.println("IMC");
        double peso = 54.0;
        double altura = 1.68;
        calcIMC instance = new calcIMC();
        Double expResult = 19.13265306122449;
        Double result = instance.imc(peso, altura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Resultado method, of class calcIMC.
     */
    @Test
    public void testResultado() {
        System.out.println("Resultado");
        double imc = 19.1;
        calcIMC instance = new calcIMC();
        String expResultado = "normal";
        String resultFinal = instance.resultado(imc);
        assertEquals(expResultado, resultFinal);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
