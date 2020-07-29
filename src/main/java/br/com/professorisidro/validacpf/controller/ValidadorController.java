package br.com.professorisidro.validacpf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.validacpf.service.Validador;

@RestController
@CrossOrigin("*")
public class ValidadorController {
	
	@GetMapping("/validacpf")
	public String validaCPF(@RequestParam String cpf) {
		if (Validador.isCPF(cpf)) {
			return "{\"status\": \"valido\"}";
		}
		 return "{\"status\": \"invalido\"}";
	}

}
