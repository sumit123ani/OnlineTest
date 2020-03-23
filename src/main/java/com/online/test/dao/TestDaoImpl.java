package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Test;
import com.online.tets.util.TestCollection;

public class TestDaoImpl implements TestDaoI {

	TestCollection testCollect = new TestCollection();
	
	@Override
	public Test addTest(Test test) {
		// TODO Auto-generated method stub
		
		return testCollect.addTest(test);
		
	}

	@Override
	public Test updateTest(BigInteger testId, Test test, String updateType) {
		// TODO Auto-generated method stub
		
		Test currentTest = testCollect.showTest(testId);
		
		test.setTestId(currentTest.getTestId());
		test.setTestTitle(currentTest.getTestTitle());
		test.setCurrentQuestion(currentTest.getCurrentQuestion());
		test.setTestMarksScored(currentTest.getTestMarksScored());
		
		if(updateType.equals("duration"))
		 test.setTestQuestions(currentTest.getTestQuestions());
		else
			test.setTestDuration(currentTest.getTestDuration());
		
		if(currentTest.getTestMarksScored() != null)
		 test.setTestTotalMarks(currentTest.getTestMarksScored());
		
		test.setStartTime(currentTest.getStartTime());
		
		return testCollect.updateTest(testId, test);
		
		
	}

	@Override
	public Test deleteTest(BigInteger testId) {
		// TODO Auto-generated method stub
		
		return testCollect.deleteTest(testId);
		
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
