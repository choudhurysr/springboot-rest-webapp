package com.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springboot.model.Question;

public class QuestionStub {
	private static Map<Long, Question> questions = new HashMap<Long, Question>();
	private static Long idIndex = 4L;

	//populate initial questions
	static {
		Question a = new Question(1L, "Spring Boot", "What is Spring Boot?", "Framework that makes is easy to develop Spring applications.");
		questions.put(1L, a);
		Question b = new Question(2L, "Spring Boot", "What are Spring Boot Starters?", "Starters are dependency descriptors that reference a list of libraries.");
		questions.put(2L, b);
		Question c = new Question(3L,  "Spring Boot", "What is the name for Spring Boot Web Starter ?", "spring-boot-starter-web");
		questions.put(3L, c);
		Question d = new Question(4L,  "Spring Boot", "What is the name for Spring Boot JPA Starter ?", "spring-boot-starter-data-jpa");
		questions.put(4L, d);
	}

	public static List<Question> list() {
		return new ArrayList<Question>(questions.values());
	}

	public static Question create(Question question) {
		idIndex += idIndex;
		question.setId(idIndex);
		questions.put(idIndex, question);
		return question;
	}

	public static Question get(Long id) {
		return questions.get(id);
	}

	public static Question update(Long id, Question question) {
		questions.put(id, question);
		return question;
	}

	public static Question delete(Long id) {
		return questions.remove(id);
	}
}
