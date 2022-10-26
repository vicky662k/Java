package com.ey.src;

public class VariableExample {
static int a;
static float b;
static char c;
static String d;

public void values() {
	a=5;
	b=4.0f;
	c='m';
	d="hello";
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}

public static void main(String args[]) {
	VariableExample obj = new VariableExample();
	obj.values();
	
}


}
