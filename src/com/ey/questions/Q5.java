package com.ey.questions;

import java.io.IOException;
import java.util.Scanner;

public class Q5 {

	
public static void main (String args[]) throws IOException {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter First Name : ");
		String f = sc.nextLine();
		System.out.println("Enter Middle Name : ");
		String m = sc.nextLine();
		System.out.println("Enter Last Name : ");
		String l = sc.nextLine();
		
		
		System.out.print("Name:"+f+" "+m+" "+l);
		
		sc.close();
	
	}
}
