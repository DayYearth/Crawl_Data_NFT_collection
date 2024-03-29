package com.example.model;

public class Blog {
	private String title;
	private String content;
	
	public Blog(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	public Blog() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return this.title;
	}

}
