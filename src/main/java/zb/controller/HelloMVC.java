package zb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HelloMVC {
	@RequestMapping("/mvc")
	public String helloMvc() {
		return "home";
	}
}
