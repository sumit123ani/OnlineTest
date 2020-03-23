package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.Test;

public interface TestDaoI {

	public Test addTest(Test  test);
	
	public Test updateTest(BigInteger testId, Test test, String updateType);
	
	public Test deleteTest(BigInteger testId);
	
	public Boolean assignTest(Long userId, Test test);
}
