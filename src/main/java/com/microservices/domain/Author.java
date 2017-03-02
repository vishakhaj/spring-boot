package com.microservices.domain;

public class Author {

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
		return "Author [firsname=" + firstname + ", lastname=" + lastname + ", post=" + post + ", getFirsname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getPost()=" + getPost() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
