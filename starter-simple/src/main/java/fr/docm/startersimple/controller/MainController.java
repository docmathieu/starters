package fr.docm.startersimple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
}
