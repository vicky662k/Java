package com.ey.questions;

public class SBI implements Bank{

	@Override
	public int getROI() {
		// TODO Auto-generated method stub
		System.out.println("ROI:");
		return 1;
	}
	public static void main(String args[]) {
		SBI b = new SBI();
		System.out.println(b.getROI());
	}
	
}
