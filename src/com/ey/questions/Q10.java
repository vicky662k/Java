package com.ey.questions;

import java.util.Scanner;

public class Q10 {
	static long accno;
	static String name,status,type;
	
	public static void main(String args[]) {
		Q10 obj = new Q10();
		obj.collect();
		obj.display();
		
	}
	public void collect() {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account number:");
		accno=sc.nextLong();
		System.out.println("Enter Account Holder Name:");
		name=sc.next();
		System.out.println("Enter Account Type:");
		status=sc.next();
		System.out.println("Enter Account Status:");
		type=sc.next();
		sc.close();
			
	}
	
	public void display() {
		
		System.out.println("Account Number:"+accno);
		System.out.println("Account Holder Name:"+name);
		System.out.println("Account Type:"+type);
		System.out.println("Account Status:"+status);	
	}
	
	

}
