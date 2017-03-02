package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.microservices.service.AuthorService;

@Controller
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@RequestMapping("/author/{id}")
	public ModelAndView getAuthorId(@PathVariable(value = "id") String id, ModelAndView model) {
		
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("author", authorService.getAuthorId(id));
		return mav;
	}
}
