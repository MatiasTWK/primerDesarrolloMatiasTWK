package cl.twk.miprimerdesarrollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value = "/ejemplos")
	public String ejemplos(Model model) {
		model.addAttribute("nombreUsuario","Matias Gallardo");
		return "ejemplos";	
	}

}
