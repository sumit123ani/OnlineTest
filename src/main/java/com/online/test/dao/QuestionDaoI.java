package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Question;

public interface QuestionDaoI {

	public Question addQuestion(Question question);
	
	public Question updateQuestion(BigInteger queId, Question question, String updateType);
	
	public Question deleteQuestion(BigInteger queId, Question question);
	
	
	public Question showQuestion(BigInteger queId);
}
