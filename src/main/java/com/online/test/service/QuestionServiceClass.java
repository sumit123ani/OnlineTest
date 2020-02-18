package com.online.test.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import com.online.test.bean.Question;
import com.online.test.dao.QuestionDaoClass;

public class QuestionServiceClass implements QuestionService{

	Question createQue = new Question();
	Scanner s = new Scanner(System.in);
	
	QuestionDaoClass queDao = new QuestionDaoClass();
	
	@Override
	public Question addQuestion() {
		// TODO Auto-generated method stub
		
		ArrayList<String> option = new ArrayList<String>();
		
		int i=0;
		
		System.out.println("Enter testId");
		BigInteger tId = s.nextBigInteger();
		
		System.out.println("Enter question id");
		BigInteger qId = s.nextBigInteger();
		
		System.out.println("Enter question title");
		
		String qTitle = s.next();
		
		System.out.println("Enter question options");
		
		
		while(i < 4) {
		System.out.println("Enter "+i+"st option");
		String opt = s.next();
		
		option.add(opt);
		
		i++;
		}
		
		System.out.println("Enter correct option");
		Integer cOption = s.nextInt();
		
		//System.out.println();
		
		System.out.println("Enter question marks");
		BigDecimal queMark = s.nextBigDecimal();
		
		createQue.setQuestionId(qId);
		createQue.setQuestionTitle(qTitle);
		createQue.setQuestionOptions(option);
		createQue.setQuestionMarks(queMark);
		createQue.setQuestionAnswer(cOption);
		
		return queDao.addQuestion(tId, createQue);
	
	}
	
	public Question showQuestion()
	{
		System.out.println("Enter question id");
		
		BigInteger qId = s.nextBigInteger();
		
		return queDao.showQuestion(qId);
	}
	
}
