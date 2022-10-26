package com.ey.questions1;

public class ICICI extends Bank {

	public int getROI() {
		return 11;
	}
	public static void main(String args[]) {
		
		ICICI k = new ICICI();
		System.out.println("Rate of Interest:"+k.getROI());
		
	}
}
