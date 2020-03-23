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
		userMap.put((long) 1001,  new User((long) 1001,  "Sumit123",      userTest, true, "Sumit@123"));
		userMap.put((long) 1002,  new User((long) 1002,  "Amit123",       userTest, false, "Sumit@123"));
		userMap.put((long) 1003,  new User((long) 1003,  "Ani998",        userTest, false, "Sumit@123"));
		userMap.put((long) 1004,  new User((long) 1004,  "Aman002",       userTest, false, "Sumit@123"));
		userMap.put((long) 1005,  new User((long) 1005,  "Vivek334",      userTest, false, "Sumit@123"));
		userMap.put((long) 1006,  new User((long) 1006,  "Rj12_ani",      userTest, false, "Sumit@123"));
		userMap.put((long) 1007,  new User((long) 1007,  "Kumar332_a",    userTest, true, "Sumit@123"));
		userMap.put((long) 1008,  new User((long) 1008,  "Susil887",      userTest, true, "Sumit@123"));
		userMap.put((long) 1009,  new User((long) 1009,  "kapil29sharma", userTest, true, "Sumit@123"));
		userMap.put((long) 1010, new User((long)  1010,  "Avinash02kl",   userTest, true, "Sumit@123"));
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