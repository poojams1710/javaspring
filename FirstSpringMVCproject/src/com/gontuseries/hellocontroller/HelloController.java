package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.Model

@Controller

public class HelloController {
	
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView helloworld(@PathVariable Map<String,String>   pathVars) {
		String name=pathVars.get("username");
		String country=pathVars.get("countryname");
		ModelAndView modelandview=new ModelAndView("HelloPage");
	modelandview.addObject("msg","hello" +name +"  from"+country);
		return modelandview;
	}
	@RequestMapping("/hi")
	public ModelAndView hiworld() {
	
		ModelAndView modelandview=new ModelAndView("HelloPage");
	modelandview.addObject("msg","hi world");
		return modelandview;
	}

	
	
	
	
	
	
}
