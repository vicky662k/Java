package com.ey.src;

public class Student {
	
	public static void main(String args[]) {
		// Constructor injection
		
		Encapsultion obj = new Encapsultion(7,22,"vikku");
		obj.display();
		
		// get & set methods
		
		obj.setname("vikku");
		obj.setage(22);
		obj.setrollno(7);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		System.out.println(obj.getrollno());
		
		
	}

}
