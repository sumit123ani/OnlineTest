package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Question;

public interface QuestionDao {

	public Question addQuestion(BigInteger testId, Question question);
	
	public Question updateQuestion(BigInteger testId, Question question);
	
	public Question deleteQuestion(BigInteger testId, Question question);
	
	
	public Question showQuestion(BigInteger queId);
}
