package com.microservices.repository;

import com.microservices.domain.Author;

public interface AuthorRepository {

	Author findById(String id);
}
