package com.ey.questions;

import java.io.IOException;
import java.util.Scanner;

public class Q6 {
	
	public static void main (String args[]) throws IOException {
		Q6 obj = new Q6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		int a = sc.nextInt();
		System.out.println("Enter B :");
		int b = sc.nextInt();
		
		int v = obj.divide(a,b);
		
		System.out.println("Result :"+v);
		sc.close();
		
	
	}
	public int divide(int a, int b) {
		
		int r=a/b;
		return r;
		
		}
	

}
