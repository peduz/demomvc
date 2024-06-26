package it.gpedulla.mvc.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bootstrap")
public class BootstrapGreetings {

	@Value("${demo.colore.default}")
	private String coloreDefault;
	
	@GetMapping("/saluta")
	public String saluta() {
		return "saluta";
	}
	
	@GetMapping("/studente")
	public String studente(Model model, @RequestParam("id") String id) {
		
		/*
		 * Utente user = db.selectById(id);
		 * if(user.age >= 18) {
		 * 	return "studenti/maggiorenni";
		 * }
		 * 
		 * if(user.daltonico) {
		 * 	model.addAttribute("colori", "verde");
		 * }
		 * 
		 * if(user.tema == null) {
		 * 	tema = default;
		 * }
		 */
		
		model.addAttribute("name", "Giuseppe");
		model.addAttribute("color", coloreDefault);
		return "studenti/studente";
	}
	
}
