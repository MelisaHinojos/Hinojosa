package com.example.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.calculadora.Controller.CalculadoraController;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	void suma() {
        assertEquals(CalculadoraController.suma(1,2), 3);
	}

    void suma2() {
        assertNotEquals(CalculadoraController.suma(1,2), 5);
	}
    void resta() {
        assertEquals(CalculadoraController.resta(1,1), 0);
	}

    void resta2() {
        assertNotEquals(CalculadoraController.resta(1,2), 4);
	}
    void multiplicar() {
        assertEquals(CalculadoraController.multiplicar(2,2), 4);
	}

    void multiplicar2() {
        assertNotEquals(CalculadoraController.multiplicar(5,2), 11);
	}
    void dividir() {
        assertEquals(CalculadoraController.dividir(10,2), 5);
	}

    void dividir() {
        assertNotEquals(CalculadoraController.dividir(1,2), 0);
	}


}
