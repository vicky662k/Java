package com.ey.questions;

import java.util.Scanner;

public class Q15 {
	
	public static void main(String args[]) {
		
		int sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		sal = sc.nextInt();
		if(sal<10000) {
			
			System.out.println("low");
			
		}else if(sal>10000 && sal<49999) {
			
			System.out.println("medium");
			
		}else if(sal >= 50000) {
			
			System.out.println("high");
			
		}
		sc.close();
	}
}
