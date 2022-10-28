package test;



import static org.junit.Assert.*;

import org.junit.Test;

import calcu.Calculadora;

public class CalculadoraTest{
    Calculadora calculadora = new Calculadora();

    @Test
    public void sumaTest(){
        assertEquals(calculadora.suma(1,2), 3);
    }

    @Test
    public void sumaTest2(){
        assertNotEquals(calculadora.suma(1,2), 4 );
    }
    @Test
    public void restaTest(){
        assertEquals(calculadora.resta(2,2), 0);
    }

    @Test
    public void restaTest2(){
        assertNotEquals(calculadora.resta(2,2), 2 );
    }
    @Test
    public void multiplicacionTest(){
        assertEquals(calculadora.multiplicacion(3,2), 6);
    }

    @Test
    public void multiplicacionTest2(){
        assertNotEquals(calculadora.multiplicacion(3,2), 8);
    }
    @Test
    public void divisionTest(){
        assertEquals(calculadora.division(4,2), 2);
    }

    @Test
    public void divisionTest2(){
        assertNotEquals(calculadora.division(1,2), 4 );
    }

    @Test
    public void cuadratica(){
        assertEquals(calculadora.cuadratica(1, -1, -2), 2, -1)
    }
    
    @Test
    public void cuadratica(){
        assertNotEquals(calculadora.cuadratica(1, -1, -2), 3, -2)
    }
    
}
