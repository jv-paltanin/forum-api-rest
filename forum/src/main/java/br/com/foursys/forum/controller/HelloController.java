package br.com.foursys.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Classe Hello para dar sorte no SprignBoot
 * 
 * @author João Victor
 * @since 17/05/2021
 * @version 1.0
 */

@Controller
public class HelloController {

	@RequestMapping("/") // anotação para mapeamento da requisição do navegador
	@ResponseBody // anoção que controla a exibição do conteúdo e não procura uma página como contexto retornado
	public String hello() {
		return "Hello World!";
	}

}
