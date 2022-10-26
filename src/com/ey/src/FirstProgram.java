package com.ey.src;

public class FirstProgram {
	
	public static void main (String args[]) {
		
		FirstProgram obj = new FirstProgram();
		
		int value = obj.add();
		System.out.println(value);
		
		System.out.println("Hello World ...!");
	}
	
	private int add() {
		
		int a=5,b=4;
		int c=a+b;
		return c;
	}

}
