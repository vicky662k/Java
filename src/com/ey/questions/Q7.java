package com.ey.questions;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String args[])  {
		
		
		int b[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range :");
		int a = sc.nextInt();
		if(a==0) {
			System.out.println("0");
		}
		else {
			
		int s=0;
		System.out.println("Enter "+a+" numbers :- ....");
		for(int i=0; i<a;i++) {
			
			b[i]=sc.nextInt();
			s=s+b[i];
		}
		float avg=s/a;
		
		System.out.println("Avg:"+avg);
		sc.close();
		
		}
	}

}
