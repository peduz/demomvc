package it.gpedulla.mvc.restcontroller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greetings")
	public String greeting(@RequestParam(name = "name") String nome, Model model) {

		model.addAttribute("name", nome);
		model.addAttribute("time", LocalDateTime.now());

		return "greeting";
	}

}
