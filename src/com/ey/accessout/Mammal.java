package com.ey.accessout;

import com.ey.questions.Animal;

public class Mammal extends Animal {
	
	String subtype; 
	
	public void stype(String s) {
		
		this.subtype=s;
		
	}
	public void dsplay() {
		System.out.println(subtype);
	}
	
	public static void main(String args[]) {
	
	Mammal m = new Mammal();
	m.name("bat");
	m.type("wild");
	m.display();
	m.stype("bird");
	m.dsplay();
	}
	
}

