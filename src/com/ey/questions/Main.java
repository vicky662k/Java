package com.ey.questions;

import com.ey.accessout.Mammal;

public class Main extends Mammal {
	
	public static void main(String args[]) {
		
		Mammal m = new Mammal();
		m.name("bat");
		m.type("wild");
		m.display();
		m.stype("bird");
		m.dsplay();
		}

}
