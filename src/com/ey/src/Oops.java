package com.ey.src;

public class Oops {
	
int a,b;
	
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("instance");	
	}
	public void out() {
		
		System.out.println("object");
	}
	public Oops() {
		System.out.println("Default");
	}
	public Oops(int c,int d) {
		a=c;
		b=d;
		System.out.println("parametrized "+a+" "+b);
	}
	public static void main(String args[]) {
		
		Oops obj = new Oops();
		Oops obj1= new Oops(2,3);
		obj.out();
		
	}


}
