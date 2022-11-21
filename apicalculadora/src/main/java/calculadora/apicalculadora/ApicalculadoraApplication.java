package calculadora.apicalculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ApicalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicalculadoraApplication.class, args);
	}

	@GetMapping("/suma")
	public int suma(@RequestParam(value="num1") int num1,@RequestParam(value = "num2")int num2) {
		return num1 + num2;
	}

	@GetMapping("/resta")
	public int resta(@RequestParam(value="num1") int num1,@RequestParam(value = "num2")int num2) {
		return num1 - num2;
	}

	@GetMapping("/multiplicar")
	public int multiplicar(@RequestParam(value="num1") int num1,@RequestParam(value = "num2")int num2) {
		return num1 * num2;
	}

	@GetMapping("/dividir")
	public int dividir(@RequestParam(value="num1") int num1,@RequestParam(value = "num2")int num2) {
		return num1 / num2;
	}
}
