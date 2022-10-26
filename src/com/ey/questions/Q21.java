package com.ey.questions;

import java.util.Scanner;

public class Q21 {
	
	public static void main(String args[]) {
	String a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String:");
	a=sc.next();
	int n = a.length();
	StringBuffer b= new StringBuffer(a);
	for(int i=0;i<n-1;i++) {
		b.append(a);
	}
	System.out.println(b);
	sc.close();
	}


}
