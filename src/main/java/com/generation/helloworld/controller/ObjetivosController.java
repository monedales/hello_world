package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-semana")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos()
	{
		return "<h2>★ Objetivos da Semana ★</h2>"
				+ "<ol>"
				+ "<b><li>Revisar conteúdo aprendido todos os dias.</li></b>"
				+ "<b><li>Organizar a semana, conciliando o bootcamp com os afazeres domésticos.</li></b>"
				+ "<b><li>Planejar financeiramente o próximo mês.</li></b>"
				+ "</ol>";		
	}

}
