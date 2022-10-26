package com.ey.questions;

import java.util.Scanner;

public class Programmer extends Employee {
	
	
	Scanner sc = new Scanner(System.in);
	
	
	
	int bonus;
	float total_salary;
	
	
	public void total(float s) {
		float t;
		System.out.println("Enter bonus:");
		bonus = sc.nextInt();
		t=s+bonus;
		System.out.println(t);
		
		
	}
	public static void main(String args[]) {
		Programmer q = new Programmer();
		q.total(q.getsal());
		
	}

}
