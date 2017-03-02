package com.microservices.viewbean;

import com.microservices.domain.Post;

public class AuthorViewBean {

	private String id;

	private String firstname;

	private String lastname;

	private Post post;

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public Post getPost() {
		return post;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AuthorViewBean [firstname=" + firstname + ", lastname=" + lastname + ", post=" + post + "]";
	}

}
