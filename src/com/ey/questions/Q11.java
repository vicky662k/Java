package com.ey.questions;

import java.util.Scanner;

public class Q11 {
	static int age;
	static String name,addr,gend,qual;
	
	public static void main(String args[]) {
		Q11 obj = new Q11();
		obj.collect();
		obj.display();
		
	}
	public void collect() {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Address:");
		addr=sc.next();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter Gender:");
		gend=sc.next();
		System.out.println("Enter Qualification:");
		qual=sc.next();
		sc.close();
			
	}
	
	public void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Address:"+addr);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gend);
		System.out.println("Qualification:"+qual);	
	}
	
	

}


