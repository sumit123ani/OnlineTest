package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Question;
import com.online.tets.util.QuestionCollection;

public class QuestionDaoClass implements QuestionDao{

	QuestionCollection queCollect = new QuestionCollection();
	
	@Override
	public Question addQuestion(BigInteger testId, Question question) {
		// TODO Auto-generated method stub
		
		return queCollect.addQuestion(testId, question);
		
	}

	@Override
	public Question updateQuestion(BigInteger testId, Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question deleteQuestion(BigInteger testId, Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question showQuestion(BigInteger queId) {
		// TODO Auto-generated method stub
		return queCollect.showQuestion(queId);
	}

	
	
}
