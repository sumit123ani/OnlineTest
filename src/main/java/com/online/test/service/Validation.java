package com.online.test.service;

public interface Validation {
	
	String userIdPattern="[1-9][0-9][0-9][0-9]";
	String hh="[1-9][0-9]*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}

}
