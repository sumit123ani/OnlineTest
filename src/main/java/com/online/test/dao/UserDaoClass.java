package com.online.test.dao;

import java.math.BigInteger;

import com.online.test.bean.User;
import com.online.tets.util.UserCollection;

public class UserDaoClass implements UserDao{

	UserCollection uCollection = new UserCollection();
	
	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		
		uCollection.addUser(u);
		
	}

//	@Override
//	public void assignTestToNewUser(BigInteger ) {
//		// TODO Auto-generated method stub
//		
//		return 
//		
//	}

}
