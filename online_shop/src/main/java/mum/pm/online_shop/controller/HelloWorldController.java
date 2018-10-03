package mum.pm.online_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller(value= "/")
public class HelloWorldController {
	@GetMapping
	public String goHome(Model model) {
		model.addAttribute("groupName", "Project Management Group");
		return "index";
	}
}
