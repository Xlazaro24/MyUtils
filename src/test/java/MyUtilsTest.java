/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.example.myutils.MyUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyUtilsTest {

    @Test
    void testEsTraspas() {
        assertTrue(MyUtils.esTraspas(2020));
        assertFalse(MyUtils.esTraspas(2019));
        assertTrue(MyUtils.esTraspas(2000));
        assertFalse(MyUtils.esTraspas(1900));
    }

    @Test
    void testEsPrimer() {
        assertTrue(MyUtils.esPrimer(2));
        assertTrue(MyUtils.esPrimer(13));
        assertFalse(MyUtils.esPrimer(15));
        assertFalse(MyUtils.esPrimer(1));
        assertFalse(MyUtils.esPrimer(57));
    }

    @Test
    void testFactorial() {
        assertEquals(1, MyUtils.factorial(0));
        assertEquals(1, MyUtils.factorial(1));
        assertEquals(120, MyUtils.factorial(5));
    }

    @Test
    public void testInvertirCadena() {
    assertEquals("aloH", MyUtils.invertirCadena("Hola"));
    assertEquals("123", MyUtils.invertirCadena("321"));
}
    
    @Test
        public void testExtreureMaxim() {
            assertEquals(9, MyUtils.extreureMaxim(new int[]{3,7,1,9}));
            assertEquals(-1, MyUtils.extreureMaxim(new int[]{-5,-3,-1,-4}));
        }

        @Test
    public void testSumarDigits() {
    assertEquals(10, MyUtils.sumarDigits(1234));
    assertEquals(6, MyUtils.sumarDigits(123));
    assertEquals(0, MyUtils.sumarDigits(0));
    assertEquals(1, MyUtils.sumarDigits(-1)); // prueba con negativo
}
    
}
