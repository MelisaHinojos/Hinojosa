package com.example.calculadora.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculadoraController {
    
    @GetMapping("/suma")
	@ResponseBody
    public Map<String, String> suma(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        HashMap<String, String> suma = new HashMap<>();
        if(num1.isPresent() && num2.isPresent()) {
			suma.put("resultado", Integer.toString(num1.get() + num2.get()));
        }
        return suma;
    }

    @GetMapping("/resta")
	@ResponseBody
    public Map<String, String> resta(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        HashMap<String, String> resta = new HashMap<>();
        if(num1.isPresent() && num2.isPresent()) {
			resta.put("resultado", Integer.toString(num1.get() - num2.get()));
        }
        return resta;
    }
    @GetMapping("/multiplicar")
	@ResponseBody
    public Map<String, String> multiplicar(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        HashMap<String, String> multiplicar = new HashMap<>();
        if(num1.isPresent() && num2.isPresent()) {
			multiplicar.put("resultado", Integer.toString(num1.get() * num2.get()));
        }
        return multiplicar;
    }
    @GetMapping("/dividir")
	@ResponseBody
    public Map<String, String> dividir(@RequestParam Optional<Integer> num1, @RequestParam Optional<Integer> num2){
        HashMap<String, String> dividir = new HashMap<>();
        if(num1.isPresent() && num2.isPresent()) {
			dividir.put("resultado", Integer.toString(num1.get() / num2.get()));
        }
        return dividir;
    }  
    
    

}