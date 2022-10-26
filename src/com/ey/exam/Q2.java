package com.ey.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		String[] inp = new String[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++) {
			inp[i]=sc.next();
		}
		List<String> slist = new ArrayList<>();
		Map<String,String> smap = new HashMap<>();
		String[] keys = new String[10];
		for(int i=0;i<n;i++) {
			keys[i]=capital(inp[i]);
			
		}
		for(int i=0;i<n;i++) {
			if(inp[i].equalsIgnoreCase(inp[i+1])) 
				
			{slist.add(inp[i]);}
			else
			
			{smap.put(keys[i],inp[i]);}
			
		}
		System.out.println(smap);
		System.out.println(slist);
	
		
	}
	public static String capital(String s) {
		String f=s.substring(0, 3);
		String fl= f.toUpperCase();
		return fl;
		
		
	}

}
