package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController {
	
	@GetMapping("/index") 
	public String index(Model mensaje){
		mensaje.addAttribute("msj","Listo para mandar txt");
		return "index";
	}
}
