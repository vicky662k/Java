package com.ey.questions;

import java.util.Scanner;

public class Employee {

	float sal;
	Scanner sc = new Scanner(System.in);
	
	public float getsal() {
		
		System.out.println("Enter salary:");
		sal=sc.nextFloat();
		return sal;
		
	}
	
}
