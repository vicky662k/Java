package com.ey.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryDetails {
	static Map<String,CountryDetails> smap = new HashMap<>();
	int id;
	String name,cc;
	public int getId() {
		return id;
	}
	public String getCc() {
		return cc;
	}
	public String getName() {
		return name;
	}	
	
	public CountryDetails() {
		
	}
	public CountryDetails(int i,String n,String c) {
		this.id=i;
		this.name=n;
		this.cc=c;
	}
	
	public static void main(String[] args) {
		String na,cc;
		int id;
		
		ArrayList<String> t= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		CountryDetails[] C=new CountryDetails[10];
		for(int i=0;i<5;i++) {
			System.out.println("Enter id:");
			id=sc.nextInt();
			System.out.println("Enter country name:");
			na=sc.next();
			System.out.println("Enter country code:");
			cc=sc.next();
		
			C[i]=new CountryDetails(id,na,cc);
			try {
				if(smap.containsKey(cc)) {
					throw new DuplicateKeyException("Duplicate Key Not Found!");
				}else {
					CountryDetails.storeCountries(C[i].getCc(),C[i]);
				}
			}catch(DuplicateKeyException e) {
				System.out.println(e.getMessage());
			}
		
			
		}
		
		t.addAll(smap.keySet());
		Collections.sort(t);
		for(String y:t) {
			System.out.println("id:"+smap.get(y).getId()+" "+"Name:"+smap.get(y).getName()+smap.get(y).getCc());
		}
		sc.close();
		
		
	}

	public static void storeCountries(String cc,CountryDetails f) {
		smap.put(cc, f);
		
	}
	

}
