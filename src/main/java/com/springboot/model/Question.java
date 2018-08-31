package com.springboot.model;

public class Question {
	Long id;
	String subject;
	String description;
	String answer;
	

	public Question() { }

	public Question(Long id, String subject, String description, String answer) {
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.answer = answer;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
