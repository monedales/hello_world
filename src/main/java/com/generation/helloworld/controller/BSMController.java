package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BSMController {
	
	@GetMapping
	public String bsmGen()
	{
		return "<h1>BSM's da Generation Brasil</h1>"
				+ "<h2>★COMPETÊNCIAS COMPORTAMENTAIS★</h2>"
				+ "<ul>"
				+ "<li>Comunicação</li>"
				+ "<li>Proatividade</li>"
				+ "<li>Orientação ao Detalhe</li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "<h2>★MENTALIDADES★</h2>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Persistência</li>"
				+ "</ul>";
	}

}
