package com.online.tets.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.online.test.bean.Question;
import com.online.test.bean.Test;
import com.online.test.dao.QuestionDao;
import com.online.test.dao.QuestionDaoClass;
import com.online.test.dao.TestDao;
import com.online.test.service.QuestionServiceClass;
import com.online.test.service.ServiceTest;
import com.online.test.service.TestServiceInt;

public class TestCollection {

	//static QuestionServiceClass queService = new QuestionServiceClass();
	//TestDao testDao = new TestDao();
	static QuestionDaoClass questionDao = new QuestionDaoClass();
	
	static ArrayList<Test> testList = new ArrayList<Test>();
	static Set<Question> question1 = new HashSet<Question>();
	static Set<Question> question2 = new HashSet<Question>();
	static Set<Question> question3 = new HashSet<Question>();
	
	static Set<Question> question4 = new HashSet<>();
	
	static Question que = new Question();
	
	Test test = new Test();
	
	static 
	{
		
		//question1.add(queService.showQuestion());
		question1.add(questionDao.showQuestion(BigInteger.valueOf(001)));
		question1.add(questionDao.showQuestion(BigInteger.valueOf(001)));
		
		question2.add(questionDao.showQuestion(BigInteger.valueOf(002)));
		question2.add(questionDao.showQuestion(BigInteger.valueOf(003)));
		
		question3.add(questionDao.showQuestion(BigInteger.valueOf(001)));
		question3.add(questionDao.showQuestion(BigInteger.valueOf(004)));
		
		
		testList.add(new Test(BigInteger.valueOf(101), "Java Test",LocalTime.of(02,30,00),question1, 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(70.20), que, LocalDateTime.of(2020, 2, 12, 9, 30,00, 0),
				LocalDateTime.of(2020, 2, 13, 12, 00,00, 0)));
		
		testList.add(new Test(BigInteger.valueOf(102), "CSS Test",LocalTime.of(02,00,00),question2, 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(60.20), que, LocalDateTime.of(2020, 2, 15, 9, 30,00, 0),
				LocalDateTime.of(2020, 2, 15, 02, 30,00, 0)));
		
		testList.add(new Test(BigInteger.valueOf(102), "CSS Test",LocalTime.of(02,00,00),question3, 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(60.20), que, LocalDateTime.of(2020, 2, 15, 9, 30,00, 0),
				LocalDateTime.of(2020, 2, 15, 02, 30,00, 0)));
		
		testList.add(new Test(BigInteger.valueOf(102), "CSS Test",LocalTime.of(02,00,00),question4, 
				BigDecimal.valueOf(100.00), BigDecimal.valueOf(60.20), que, LocalDateTime.of(2020, 2, 15, 9, 30,00, 0),
				LocalDateTime.of(2020, 2, 15, 02, 30,00, 0)));
		
	}
	
	
	static public void addTest(Test test) {
		testList.add(test);
	}

	static public Test showTest(BigInteger id)
	{
		for(Test test : testList)
		{
			if(test.getTestId().compareTo(id) == 0)
				return test;
		}
		
		return null;
	}
	
	public Test updateTest(BigInteger id, Test test)
	{
		
		int index =0;
		for(int i=0; i<testList.size(); i++)
		{
			if(testList.get(i).getTestId() == id)
			{
				index = i;
				break;
			}
		}
		
			testList.set(index, test);
		
			return test;
	}

	public void deleteTest(BigInteger id)
	{
		int index =0;
		
		for(int i=0; i<testList.size(); i++) {
		 if(testList.get(i).getTestId().compareTo(id) == 0) 
			 index = i;
		}
		testList.remove(index);
	}
	
	public void addQuestionToTest(BigInteger testId, Question question)
	{
		
		question4.add(question);
	
		
	}
	
}
