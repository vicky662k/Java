package com.ey.questions;

public class Animal {
	
	String name,type;
	
	public void name(String n) {
		
		this.name=n;
		
	}
	public void type(String t) {
		
		this.type=t;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(type);
	}
	public static void main(String args[]) {
		Animal a = new Animal();
		a.name("lion");
		a.type("wild");
		a.display();
	}

}
