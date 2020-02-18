import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import com.online.test.bean.Question;
import com.online.test.service.QuestionServiceClass;
import com.online.test.service.ServiceTest;

class UnitTesting {

	QuestionServiceClass questionService = new QuestionServiceClass();
	ServiceTest testService = new ServiceTest();
	
	@Test
	void test() {
		//fail("Not yet implemented");
		
		Question question = questionService.addQuestion();
		
		assertEquals("java_test" , question.getQuestionTitle());
		
		assertEquals(BigInteger.valueOf(100), question.getQuestionId());
	}

//  @Test
//  void test1()
//  {
//	  assertEquals(expected, actual);
//  }
	
}
