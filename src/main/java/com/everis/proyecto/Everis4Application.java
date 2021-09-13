package com.everis.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Everis4Application {

	public static void main(String[] args) {
		SpringApplication.run(Everis4Application.class, args);
	}

	@RequestMapping("/")
	public String pagina() {
		return "Clase lunes";
	}
	
	@RequestMapping("/clase")
	public String pagina1(){
		return "Clase Lunes 2";
	
	}
	
}
