package com.microservices.domain;

public class Post {

	private String title;

	private String body;

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", body=" + body + "]";
	}

}
