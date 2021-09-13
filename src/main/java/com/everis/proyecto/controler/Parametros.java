package com.everis.proyecto.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Parametros {
	public String variable;

	/*@RequestMapping("/formulario")
	public String pagina2(@RequestParam(value="nombre") String parametro1, 
			@RequestParam(value="apellido") String parametro2,
			@RequestParam(value="limite") String parametro3, 
			@RequestParam(value="codigopostal") String parametro4) {
		System.out.println("parametros recibidos Post: "+parametro1+" "+ parametro2 + " " + parametro3 + " " + parametro4 );
		return "index.jsp";
	}*/
	@RequestMapping(value="/formulario",method = RequestMethod.GET)
	public String login(@RequestParam(value="nombre") String parametro1, 
			@RequestParam(value="apellido") String parametro2,
			@RequestParam(value="limite") String parametro3, 
			@RequestParam(value="codigopostal") String parametro4) {

	System.out.println("get: "+parametro1+" "+ parametro2 + " " + parametro3 + " " + parametro4 );

	return "index.jsp";
	}
	@RequestMapping(value="/formulario",method = RequestMethod.POST)
	public String loginPost(@RequestParam(value="nombre") String parametro1, 
			@RequestParam(value="apellido") String parametro2,
			@RequestParam(value="limite") String parametro3, 
			@RequestParam(value="codigopostal") String parametro4) {

	System.out.println("parametros recibidos Post: "+parametro1+" "+ parametro2 + " " + parametro3 + " " + parametro4 );

	return "index.jsp";
	}

}