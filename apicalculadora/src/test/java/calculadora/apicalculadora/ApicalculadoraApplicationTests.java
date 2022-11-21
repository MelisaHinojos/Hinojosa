package calculadora.apicalculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiCalculadoraApplicationTests {

	ApicalculadoraApplication calculadora = new ApicalculadoraApplication();

	@Test
	public void suma1() {
		assertEquals(3, calculadora.suma(1, 2));
	}

	@Test
	public void suma2() {
		assertNotEquals(5,calculadora.suma(1,2));
	}


	@Test
	public void resta1() {
		assertEquals(0, calculadora.resta(1, 1));
	}

	@Test
	public void resta2() {
		assertNotEquals(4,calculadora.resta(1,2));
	}

	@Test
	public void multiplicar1() {
		assertEquals(4, calculadora.multiplicar(2, 2));
	}

	@Test
	public void multiplicar2() {
		assertNotEquals(11,calculadora.multiplicar(2,5));
	}

	@Test
	public void dividir1() {
		assertEquals(5, calculadora.dividir(10, 2));
	}

	@Test
	public void dividir2() {
		assertNotEquals(3, calculadora.dividir(1, 2));
	}
}