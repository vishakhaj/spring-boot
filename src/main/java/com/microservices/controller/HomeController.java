package com.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.domain.Profile;

@RestController
public class HomeController {

	@RequestMapping("/")
	public Profile home() {
		RestTemplate restTemplate = new RestTemplate();
		Profile profile = restTemplate.getForObject("http://localhost:8080/data/profile.json", Profile.class);

		return profile;
	}
}
