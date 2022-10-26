package com.ey.questions;

import java.util.Scanner;

public class Q16 {

	public static void main(String args[]) {
		int a;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		a= sc.nextInt();
		if(a==1 || a==4) {
			
			System.out.println("ONE");
			
		}else if(a==2 || a==3 || a==5) {
			
			System.out.println("TWO");
			
		}else {
			
			System.out.println("THREE");
		}
		sc.close();
		
	}
}
