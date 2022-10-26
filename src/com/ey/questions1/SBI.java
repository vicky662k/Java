package com.ey.questions1;

public class SBI extends Bank {
	
	public int getROI() {
		return 10;
	}
	public static void main(String args[]) {
		
		SBI k = new SBI();
		System.out.println("Rate of Interest:"+k.getROI());
		
	}

}

