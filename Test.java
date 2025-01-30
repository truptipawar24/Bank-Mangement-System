package com.braindata.bankmanagement.client;
import java.util.Scanner;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;


public class Test {
	
	public static void main(String[] args)
	{
		Rbi bank=new Sbi(); 
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.createAccount");
			System.out.println("2.displayAllDetails");
			System.out.println("3.depositeMoney");
			System.out.println("4. withdrawal");
			System.out.println("5.balanceCheck");
	        
		int ch= sc.nextInt();

		switch(ch)
		
		{
		case 1: 
			bank.createAccount();
			break;
			
			
		case 2: 
			bank.displayAllDetails();
			break;
			
			
		case 3: 
			bank.depositeMoney();
			break;
			
		case 4: 
			bank. withdrawal();
			break;
			
		case 5:
			bank.balanceCheck();
			
			default:
				System.out.println("Something wrong");
		}


	}
  }
}
