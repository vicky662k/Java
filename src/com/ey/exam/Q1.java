package com.ey.exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1 {
	public static void main(String[]args) throws CustomException {
		int a,b;
		String address,ad;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter address");
		address=sc.next();
		ad=address.replace("PIN-", "");
		
		try {
			if(b!=0) {
				System.out.println(a/b);
				try {
					if(!ad.isEmpty()) {
						StringTokenizer obj= new StringTokenizer(ad,",");
						while(obj.hasMoreTokens()) {
							System.out.println(obj.nextToken());
						}
					
						}else {
							throw new CustomException("String null not allowed");
						}
					
				}catch(CustomException e ) {
					System.out.println(e.getMessage());
				}
				
			}else {
				throw new CustomException("Divide by zero not allowed!");
			}
		}catch (CustomException e) {
			System.out.println(e.getMessage());
			
		}
		sc.close();
		
	}
	

}
