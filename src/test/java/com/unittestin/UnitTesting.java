package com.unittestin;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.BigInteger;
//import com.online.test.bean.Test;
import java.time.LocalTime;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.online.test.bean.Question;
import com.online.test.exception.DurationException;
import com.online.test.service.QuestionServiceImpl;
import com.online.test.service.TestServiceImpl;
import com.online.test.ui.OnlineTestMain;

class UnitTesting {

	QuestionServiceImpl questionService = new QuestionServiceImpl();
	TestServiceImpl testService = new TestServiceImpl();
	OnlineTestMain main = new OnlineTestMain();
	
	
	@Test
	void test() {
		//fail("Not yet implemented");
		
		Question question = main.addTheQuestion();
		
		assertEquals(question.getQuestionTitle() , questionService.addQuestion(question).getQuestionTitle());
		
		assertEquals(question.getQuestionId(), questionService.addQuestion(question).getQuestionId());
	}

  @Test
  void test1()
  {
	  
	  //testService.showTest();
	  System.out.println("Checkin test title");
	  
	  
	  
	  assertEquals("Java Test", testService.showTest(BigInteger.valueOf(101)).getTestTitle());
	  
	  System.out.println("Checking obtained marks");
	  assertEquals(BigDecimal.valueOf(70.20), testService.showTest(BigInteger.valueOf(101)).getTestMarksScored());
	  
  }
	
  @Test
  void test2()
  {
 
		
	  assertEquals(LocalTime.of(04, 30), testService.updateTest(BigInteger.valueOf(101), main.testUpdataion(), "duration").getTestDuration());
	  System.out.println("Check updated time duration");
  }
  
  @Test
  void test3()
  {
	  
	  
	  assertEquals( "CSS Test", testService.deleteTest(BigInteger.valueOf(102)).getTestTitle());
	  System.out.println("Checking title of deleted test");
  }
  
  @Test 
  void test4() throws DurationException
  { 
		
	  assertEquals("java", testService.addTest(main.createTest()).getTestTitle());
	  System.out.println("Checking title of deleted test");
  }
  
}
