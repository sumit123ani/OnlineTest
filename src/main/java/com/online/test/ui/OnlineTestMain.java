package com.online.test.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.online.test.bean.Test;
import com.online.test.bean.User;
import com.online.test.service.QuestionServiceClass;
import com.online.test.service.ServiceTest;
import com.online.tets.util.UserCollection;

public class OnlineTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserCollection uCollection = new UserCollection();
		
		ServiceTest serviceTest = new ServiceTest();
		
		QuestionServiceClass queService = new QuestionServiceClass();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(".......  Welcome ........");
		System.out.println("Enter user id to use our services");
		
		Long id = s.nextLong();
		
		User currentUser = uCollection.getUser(id);
		
		if(currentUser.isAdmin())
		{
			System.out.println("You are an admin ");
			
		boolean q = true;
		
		while(q == true)
		{
			
	     System.out.println("Enter 1 add test\n enter 2 to show test \n enter 3 to update the test \n enter 4 to delete the test "
	     		+ "\n enter 5 to add question \n Enter other to exit");
	     
	     int choice = s.nextInt();
	     
	     switch(choice)
	     {
	     case 1:
		   serviceTest.addTest();
		   break;
		
	     case 2:
		    Test showTetst = serviceTest.showTest();
		
		    if(showTetst != null)
		    {
		    System.out.println("Test Title \t Test id \t Test Duration \t Total Marks \t Test Start Time \t Test End Time");
		    
		System.out.println(showTetst.getTestTitle()+"\t"+showTetst.getTestId()+"\t\t"+showTetst.getTestDuration()+"\t"+showTetst.getTestTotalMarks()
		+"\t"+showTetst.getStartTime()+"\t"+showTetst.getEndTime());
		    }
		    
		    else
		    	System.out.println("No such test exists");
		    
		break;
		
		case 3:
			serviceTest.updateTest();
			break;
		
		case 4:
			serviceTest.deleteTest();
			break;
			
		case 5:
			queService.addQuestion();
			break;
			
		default:
			q = false;
			
	     }
		}
		}
		else
		{
			System.out.println("you are not an admin");
			
			boolean r = true;
			
			while(r == true)
			{
			  System.out.println("Enter 1 to give the test\n other to exit");
			    int choice = s.nextInt();
			  
			    switch (choice) {
				case 1:
					Test showTetst = serviceTest.showTest();
					
				    System.out.println("Test Title \t Test id \t Test Duration \t Total Marks \t Test Start Time \t Test End Time");
				    
				System.out.println(showTetst.getTestTitle()+"\t"+showTetst.getTestId()+"\t"+showTetst.getTestDuration()+"\t"+showTetst.getTestTotalMarks()
				+"\t"+showTetst.getStartTime()+"\t"+showTetst.getEndTime());
				
					break;

				default:
					r= false;
					break;
				}
			    
			}
		}
	}

}
