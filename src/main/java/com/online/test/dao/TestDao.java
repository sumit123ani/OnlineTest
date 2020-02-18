package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Test;
import com.online.tets.util.TestCollection;

public class TestDao implements OnlineTestDao {

	TestCollection testCollect = new TestCollection();
	
	@Override
	public Test addTest(Test test) {
		// TODO Auto-generated method stub
		
		testCollect.addTest(test);
		
		return test;
	}

	@Override
	public Test updateTest(BigInteger testId, Test test) {
		// TODO Auto-generated method stub
		
		Test currentTest = testCollect.showTest(testId);
		
		System.out.println(currentTest.getTestId());
		
		test.setTestId(currentTest.getTestId());
		test.setTestTitle(currentTest.getTestTitle());
		test.setCurrentQuestion(currentTest.getCurrentQuestion());
		test.setTestMarksScored(currentTest.getTestMarksScored());
		test.setTestQuestions(currentTest.getTestQuestions());
		test.setTestTotalMarks(currentTest.getTestMarksScored());
		test.setStartTime(currentTest.getStartTime());
		
		return testCollect.updateTest(testId, test);
		
		
	}

	@Override
	public void deleteTest(BigInteger testId) {
		// TODO Auto-generated method stub
		
		testCollect.deleteTest(testId);
		
	}

	@Override
	public Boolean assignTest(Long userId, Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	public Test showTest(BigInteger testId)
	{
		return testCollect.showTest(testId);
	}
	
}
