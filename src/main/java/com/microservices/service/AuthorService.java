package com.microservices.service;

import org.assertj.core.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.domain.Author;
import com.microservices.implementation.AuthorRepositoryImpl;
import com.microservices.mapper.AuthorUIMapper;
import com.microservices.viewbean.AuthorViewBean;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepositoryImpl authorRepositoryImpl;

	@Autowired
	private AuthorUIMapper authorMapper;

	public AuthorViewBean getAuthorId(String id) {

		if(Strings.isNullOrEmpty(id)) {
			return null;
		}

		Author authorId = authorRepositoryImpl.findById(id);
		AuthorViewBean authorViewBean = authorMapper.createUIViewBean(authorId);
		return authorViewBean;
	}
}
