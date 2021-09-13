package com.everis.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String pagina() {
		return "index.jsp";
	}
	
	//pasar parametro desde el backend al frontend
	@RequestMapping("/clase")
	public String pagina1(Model model){
		model.addAttribute("parametro1", "clase everis lunes am");
		model.addAttribute("parametro2", "esto es otro parametro");
		model.addAttribute("parametro3", "esto es otro parametro");
		model.addAttribute("parametro4", "esto es otro parametro");
		return "index.jsp";
	
	}
}
