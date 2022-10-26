package com.ey.questions;

import java.util.Scanner;

public class Q12 {
	
	public static void main(String args[]) {
		float amt;
		int t,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount:");
		amt=sc.nextFloat();
		System.out.println("Enter Time(no.of years):");
		t=sc.nextInt();
		System.out.println("1.Monthly payment.");
		System.out.println("2.Half Yearly payment.");
		System.out.println("3.Full Yearly payment.");
		System.out.println("Enter choice:");
		c=sc.nextInt();
		
		if(c==1) {
			
			float i = (amt/(t-2))/12;
			System.out.println("Installment amount:Rs "+i);	
		}
		else if(c==2) {
			float i = (amt/(t-2))/2;
			System.out.println("Installment amount:Rs "+i);
		}
		else if(c==3) {
			float i = amt/(t-2);
			System.out.println("Installment amount:Rs "+i);
		}else {
			System.out.println("Invalid input ,Pls enter within option 1 - 3.");
		}
		
		sc.close();
		
	}

}
