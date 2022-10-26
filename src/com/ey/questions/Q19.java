package com.ey.questions;

import java.util.Scanner;

public class Q19 {
	Scanner sc=new Scanner(System.in);
	int id,age;
	String name,gend;
	
	public void intialize() {
		
		System.out.println("Enter id:");
		this.id=sc.nextInt();
		System.out.println("Enter name:");
		this.name=sc.next();
		System.out.println("Enter age:");
		this.age=sc.nextInt();
		System.out.println("Enter gender:");
		this.gend=sc.next();
		
		
	}
	
	public void display() {
		
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gender:"+gend);
		
	}
	

}
