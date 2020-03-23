package com.online.test.service;

import java.math.BigInteger;

import com.online.test.bean.Question;
import com.online.test.bean.Test;
import com.online.test.exception.DurationException;

public interface IService {

public Question addQuestion(Question question);
	
	public Question showQuestion(BigInteger qId);

	public Question updateQuestion(BigInteger id, Question question, String updateType);
	
    public Test addTest(Test test) throws DurationException;
	
	public Test updateTest(BigInteger testId, Test test, String updateType);
	
    public Test deleteTest(BigInteger testId);
	
    public Test showTest(BigInteger id);
	
}
