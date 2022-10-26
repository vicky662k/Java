package com.ey.questions;

import java.util.Scanner;

public class Q20 {
	
	public static void main(String args[]) {
		String a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		a=sc.next();
		StringBuffer c = new StringBuffer(a);
		System.out.println("Enter String 2");
		b=sc.next();
		StringBuffer s = new StringBuffer(b);
		sc.close();
		c.reverse();
		s.reverse();
		c.append(s);
		System.out.print(c);
		
		
	
		
		
		
		
	}

}
