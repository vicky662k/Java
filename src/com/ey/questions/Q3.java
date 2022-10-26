package com.ey.questions;


import java.io.IOException;
import java.util.Scanner;


public class Q3 {
	
	public static void main (String args[]) throws IOException {
		
		System.out.println("Enter age : ");
		Scanner r = new Scanner(System.in);
		int values = r.nextInt();
		
		System.out.println("I am "+ values + " years old. ");
		
		r.close();
		
	}


}
