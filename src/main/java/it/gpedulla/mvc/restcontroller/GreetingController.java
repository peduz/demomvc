package it.gpedulla.mvc.restcontroller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.gpedulla.mvc.model.Utente;

@Controller
@RequestMapping("/simple")
public class GreetingController {

	@GetMapping("/greetings")
	public String greeting(@RequestParam(name = "name") String nome, Model model) {

		model.addAttribute("name", nome);
		model.addAttribute("time", LocalDateTime.now());
		model.addAttribute("username", "Pinco Pallo");

		Utente utenteProva = new Utente();
		utenteProva.setName("Pippo");
		utenteProva.setSurname("Pluto");
		utenteProva.setId(123L);
		
		Utente utenteProva2 = new Utente();
		utenteProva2.setName("Paperino");
		utenteProva2.setSurname("Pluto");
		utenteProva2.setId(12L);
		
		Utente utenteProva3 = new Utente();
		utenteProva3.setName("Topolino");
		utenteProva3.setSurname("Pluto");
		utenteProva3.setId(23L);
		
		model.addAttribute("user", utenteProva);
		
		List<Utente> listaUtenti = new ArrayList<>();
		listaUtenti.add(utenteProva);
		listaUtenti.add(utenteProva2);
		listaUtenti.add(utenteProva3);
		
		model.addAttribute("userList", listaUtenti);
		
		return "greeting";
	}

}
