package com.ey.accessspec;

public class Testb {
	public static void main(String args[]) {
		Testa obj = new Testa();
		int value1 = obj.addPubic();
		int value2 = obj.addProtected();
		int value3 = obj.addDefault();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	
	
	}
	

}
