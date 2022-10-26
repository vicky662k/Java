package com.ey.questions;

import java.util.Scanner;

public class Recruitment {
	
	String name,qual;
	int exp,c=0;
	
	public static void main(String args[]) {
		
		Recruitment a = new Recruitment();
		a.shortlist();
		}
	
	public void shortlist() {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(c<3) {
			
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter qual:");
		qual=sc.next();
		System.out.println("Enter exp:");
		exp=sc.nextInt();
		if(exp == 5) {
			if(qual.equals("MBA"))
				{
					c=c+1;
			
				}
			
			}
		}
		System.out.println("Recruitment process completed !");
		
		sc.close();
	}
	
	

}
