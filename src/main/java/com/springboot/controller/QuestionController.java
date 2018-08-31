package com.springboot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Question;

@RestController
@RequestMapping("/api/")
public class QuestionController {
	@RequestMapping(value = "questions", method = RequestMethod.GET)
	public List<Question> list(){
		return QuestionStub.list();
	}

	@RequestMapping(value = "questions", method = RequestMethod.POST)
	public Question create(@RequestBody Question question){
		return QuestionStub.create(question);
	}
	
	@RequestMapping(value = "questions/{id}", method = RequestMethod.GET)
	public Question get(@PathVariable Long id){
		return QuestionStub.get(id);
	}
	
	@RequestMapping(value = "questions/{id}", method = RequestMethod.PUT)
	public Question update(@PathVariable Long id, @RequestBody Question question){
		Question existingQuestion = QuestionStub.get(id);
		BeanUtils.copyProperties(question, existingQuestion);
		return QuestionStub.update(id, existingQuestion);
	}
	
	@RequestMapping(value = "questions/{id}", method = RequestMethod.DELETE)
	public Question delete(@PathVariable Long id){
		Question existingQuestion = QuestionStub.get(id);
		QuestionStub.delete(id);
		return existingQuestion;
	}
}
