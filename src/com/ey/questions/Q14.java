package com.ey.questions;

import java.util.Scanner;

public class Q14 {
	
	public static void main(String args[]) {
		float amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary:");
		amt=sc.nextFloat();
		if(amt>3000)
		{
			amt=amt+500;
			System.out.println("Salary with bonus:"+amt);
		}else {
			System.out.println("Salary bonus not added");
		}
		sc.close();
		
		
	}

}
