package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/exibicao")

public class AllControllers {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String exibeBSM() {
		
		return "MENTALIDADES\r\n"
				+ "Orientação ao futuro \r\n"
				+ "Responsabilidade pessoal\r\n"
				+ "Mentalidade de crescimento \r\n"
				+ "Persistência \r\n"
				+ "\r\n"
				+ "HABILIDADES\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Orientação ao detalhe \r\n"
				+ "Pró-atividade\r\n"
				+ "Comunicação";
	}
	
	@GetMapping("/objetivos")
	public String exibeObjetivos() {
		return "1 - Aperfeiçoar os conhecimentos no Spring"
				+ "\n2 - Iniciar o desenvolvimento do Projeto Integrador"
				+ "\n3 - Iniciar o desenvolvimento do Blog Pessoal";
	}
	
	
}
