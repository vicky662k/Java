package com.ey.questions;

import java.io.IOException;
import java.util.Scanner;

public class Q4 {
	
public static void main (String args[]) throws IOException {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Name : ");
		
		String name = sc.nextLine();
		
		System.out.println("Hello "+name+"!");
		
		sc.close();
		
	}


}
