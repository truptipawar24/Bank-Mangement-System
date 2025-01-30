package com.braindata.bankmanagement.serviceImpl;
import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi {
	
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	
	public void createAccount()
	{
		System.out.println("Enter account no.");
		a.setAccNo(sc.nextInt());
		System.out.println("Enter account name");
		a.setName(sc.next());
		System.out.println("Enter moblie no.");
		a.setMobNo(sc.next());
		System.out.println("Enter adhar no.");
		a.setAdharNo(sc.next());
		System.out.println("Enter gender no.");
		a.setGender(sc.next());
		System.out.println("Enter age no.");
		a.setAge(sc.nextInt());
		System.out.println("Enter balance no.");
		a.setBalance(sc.nextDouble());
		
		
	}
	public void displayAllDetails()
	{
		System.out.println("Enter account no.:"+a.getAccNo());
		
		System.out.println("Enter account name"+a.getName());
		
		System.out.println("Enter moblie no."+a.getMobNo());
		
		System.out.println("Enter adhar no."+a.getAdharNo());
		
		System.out.println("Enter gender no."+a.getGender());
		
		System.out.println("Enter age no."+a.getAge());
		
		System.out.println("Enter balance no."+a.getBalance());
		
	}
	public void depositeMoney()
	{
		 System.out.print("Enter amount to deposit: ");
	        int x=sc.nextInt();
	        double total=x+a.getBalance();
	        System.out.println(total);
	        a.setBalance(total);
	        System.out.println(a.getBalance());
	}
	public void withdrawal()
	{
		System.out.print("Enter amount to withdrawal: ");
        int x=sc.nextInt();
        double total=a.getBalance()-x;
        System.out.println(total);
        a.setBalance(total);
        System.out.println(a.getBalance());

	}
	public void balanceCheck()
	{
		System.out.println("Check Current Balance"+a.getBalance());
	}
}

	


