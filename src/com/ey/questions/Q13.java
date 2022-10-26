package com.ey.questions;

import java.util.Scanner;

public class Q13 {

	public static void main(String args[]) {
		int a[] = new int[10];
		int s=0,n;
		String b[] = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of items:");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter item "+ (i+1) + " name and price.");
			System.out.println("Enter item name:");
			b[i]=sc.next();
			System.out.println("Enter price:");
			a[i]=sc.nextInt();
			s=s+a[i];
			
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Item Name: "+b[i]+" Price: "+a[i]);
		}
		
		System.out.println("Total price: "+ s);
		if(s>3000)
		{
			float d,f;
			d= (s*10)/100;
			System.out.println("Discount price: "+ d);
			f=s-d;
			System.out.println("Final price: "+ f);
			
		}
		sc.close();
	}
}
