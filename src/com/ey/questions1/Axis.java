package com.ey.questions1;

public class Axis extends Bank {

	public int getROI() {
		return 12;
	}
	public static void main(String args[]) {
		
		Axis k = new Axis();
		System.out.println("Rate of Interest:"+k.getROI());
		
	}
}
