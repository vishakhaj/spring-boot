package com.microservices.mapper;

import org.springframework.stereotype.Component;

import com.microservices.domain.Author;
import com.microservices.viewbean.AuthorViewBean;

@Component
public class AuthorUIMapper {

	public AuthorViewBean createUIViewBean(Author author) {
		AuthorViewBean viewBean = new AuthorViewBean();
		viewBean.setId(author.getId());
		viewBean.setFirstname(author.getFirstname());
		viewBean.setLastname(author.getLastname());
		return viewBean;

	}
}
