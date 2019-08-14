package com.michael.spring.boot.swagger.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
@Controller
@RequestMapping
public class IndexController {

	public static final String SWAGGER_URL = "/swagger";

	public static final String CONTEXT_ROOT = "/";

	@RequestMapping(value={SWAGGER_URL,CONTEXT_ROOT} ,method = RequestMethod.GET)
	public String index() {
		return "redirect:/swagger-ui.html";
	}
}
