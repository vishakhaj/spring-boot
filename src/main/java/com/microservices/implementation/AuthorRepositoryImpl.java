package com.microservices.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.microservices.domain.Author;
import com.microservices.repository.AuthorRepository;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/author")
	public Author getAuthorDetails() {
		Author author = restTemplate.getForObject("http://localhost:8080/data/author.json", Author.class);
		return author;
	}

	@Override
	public Author findById(String id) {
		Author author = restTemplate.getForObject("http://localhost:8080/data/author.json", Author.class);
		return author;
	}

}
