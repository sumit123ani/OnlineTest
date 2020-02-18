package com.online.test.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.online.test.bean.Question;
import com.online.test.bean.Test;
import com.online.test.dao.TestDao;
import com.online.tets.util.QuestionCollection;

public class ServiceTest implements TestServiceInt{

	QuestionCollection coll = new QuestionCollection();
	TestDao tDao = new TestDao();
	Scanner s = new Scanner(System.in);
	Question question;
	
	Test testObj = new Test();
	
	@Override
	public Test addTest() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter testId");
		BigInteger testId = s.nextBigInteger();
		
		
	    System.out.println("Enter testTitle");
	    String testTitle = s.next();
	    
	    System.out.println("Enter testDuration ----\n enter hour");
	    int testHour = s.nextInt();
	    
	    System.out.println("enter minute");
	    int testMinute = s.nextInt();
	   
	    
		LocalTime testDuration =LocalTime.of(testHour, testMinute,00);
		
		//System.out.println("......Enter testQeustions  .....  ");
		
		System.out.println("Enter no of question ");
		
		int numQ = s.nextInt();
		
		Set<Question> testQuestions = new HashSet<Question>();
		
	
		for(int i=0; i<numQ; i++) {
		  System.out.println("Enter questionId");
		  
		  BigInteger id = s.nextBigInteger();
		  testQuestions.add(coll.showQuestion(id));
			  
		  
		}
		
		System.out.println("Enter testToatal Marks");
		BigDecimal testTotalMarks = s.nextBigDecimal();
		
		System.out.println("Enter test Marks");
	    BigDecimal testMarksScored = s.nextBigDecimal();
	    
	    //System.out.println("Enter question Marks");
	    
	    
	    for(Question que : testQuestions)
	    {
	    	 question = que;
	    }
		Question currentQuestion = question;
		
		System.out.println("Enter start time Marks");
		
		System.out.println("Enter year");
		int year = s.nextInt();
		
		System.out.println("enter month");
		int month = s.nextInt();
		
		System.out.println("enter day");
		int day = s.nextInt();
		
		System.out.println("enter hour");
		int hour = s.nextInt();
		
		System.out.println("enter minute");
		int minute = s.nextInt();
		
	    LocalDateTime startTime = LocalDateTime.of(year, month, day, hour, minute); 
		
	    System.out.println("Enter end time Marks");
	    
	    System.out.println("Enter year");
		int year1 = s.nextInt();
		
		System.out.println("enter month");
		int month1 = s.nextInt();
		
		System.out.println("enter day");
		int day1 = s.nextInt();
		
		System.out.println("enter hour");
		int hour1 = s.nextInt();
		
		System.out.println("enter minute");
		int minute1 = s.nextInt();
	    
	    LocalDateTime endTime = LocalDateTime.of(year1, month1, day1, hour1, minute1);
		
	    Test test = new Test(testId, testTitle, testDuration, testQuestions, testTotalMarks, testMarksScored, 
	    		currentQuestion, startTime, endTime);
	    
	    tDao.addTest(test);
	    
		return test;
	}

	@Override
	public Test updateTest() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the test id to update the test");
		BigInteger tId = s.nextBigInteger();
		
		System.out.println("Enter new duration \n enter hour");
		
		int testHour = s.nextInt();
		
		System.out.println("enter minute");
		int testMinute = s.nextInt();
		
		
		testObj.setTestDuration(LocalTime.of(testHour, testMinute, 00));
		
		tDao.updateTest(tId, testObj);
		
		return testObj;
	
	}

	@Override
	public void deleteTest() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter id to delete the test");
		
		BigInteger id = s.nextBigInteger();
		
		tDao.deleteTest(id);
	}

	@Override
	public Boolean assignTest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Test showTest()
	{
		System.out.println("Enter testId");
		
		BigInteger tId = s.nextBigInteger();
		
		 return tDao.showTest(tId);
	}
	
}
