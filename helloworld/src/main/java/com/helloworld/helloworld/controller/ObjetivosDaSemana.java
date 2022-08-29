package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/exibeObjetivos")

public class ObjetivosDaSemana {

	@GetMapping
	public String exibeObjetivos() {
		return "1 - Aperfeiçoar os conhecimentos no Spring"
				+ "\n2 - Iniciar o desenvolvimento do Projeto Integrador"
				+ "\n3 - Iniciar o desenvolvimento do Blog Pessoal";
	}
	
}
