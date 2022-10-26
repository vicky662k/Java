package com.ey.questions;

import java.util.Scanner;

public class Q17 {
	
	public static void main(String args[]) {
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		n=sc.next();
		switch(n) {
		
		case "King":System.out.println("You are the chief");
		break;
		case "Anil":System.out.println("You are a manager");
		break;
		case "Geeta":System.out.println("You are a manager");
		break;
		case "Anjali":System.out.println("You are HR");
		break;
		default:System.out.println(" ");
		}
		sc.close();
	}

}
