package com.online.tets.util;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.online.test.bean.Test;
import com.online.test.bean.User;

public class UserCollection {

	static HashMap<Long, User> userMap = new HashMap<Long, User>();
	static Test userTest = new Test();
	
	
	
	static
	{
		userMap.put((long) 1,  new User((long) 1,  "Sumit123",      userTest, true, "Sumit@123"));
		userMap.put((long) 2,  new User((long) 2,  "Amit123",       userTest, false, "Sumit@123"));
		userMap.put((long) 3,  new User((long) 3,  "Ani998",        userTest, false, "Sumit@123"));
		userMap.put((long) 4,  new User((long) 4,  "Aman002",       userTest, false, "Sumit@123"));
		userMap.put((long) 5,  new User((long) 5,  "Vivek334",      userTest, false, "Sumit@123"));
		userMap.put((long) 6,  new User((long) 6,  "Rj12_ani",      userTest, false, "Sumit@123"));
		userMap.put((long) 7,  new User((long) 7,  "Kumar332_a",    userTest, true, "Sumit@123"));
		userMap.put((long) 8,  new User((long) 8,  "Susil887",      userTest, true, "Sumit@123"));
		userMap.put((long) 9,  new User((long) 9,  "kapil29sharma", userTest, true, "Sumit@123"));
		userMap.put((long) 10, new User((long) 10, "Avinash02kl",   userTest, true, "Sumit@123"));
	}
	
	static public void addUser(User u)
	{
		userMap.put(u.getUserId(), u);
	}
	
	public void assignTestToUser(Long id, User user)
	{
		userMap.put(id, user);
	}
	
	public User getUser(long id)
	{
		for(Map.Entry<Long, User> map : userMap.entrySet())
		{
			if(map.getKey() == id)
			  return map.getValue();
		}
		return null;
	}
	
}