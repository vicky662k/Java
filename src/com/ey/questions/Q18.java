package com.ey.questions;

import java.util.Scanner;

public class Q18 {
	
	public static void main(String args[]) {
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter status of record player:");
		n=sc.next();
		switch(n) {
		
		case "PLAYING":System.out.println(1);
		break;
		case "RECORDING":System.out.println(1);
		break;
		case "STOPPED":System.out.println(0);
		break;
		case "PAUSED":System.out.println(0);
		break;
		default:System.out.println("2");
		}
		sc.close();
	}

}
