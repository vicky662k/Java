package com.ey.accessspec;

public class Testa {
	
	int a = 10;
	int b = 20;
	
	public int addPubic() {
		int c;
		c=a+b;
		return c;
		
	}
	protected int addProtected() {
		int c;
		c=a+b;
		return c;
		
	}
	private int addPrivate() {
		int c;
		c=a+b;
		return c;
		
	}
	 int addDefault() {
		int c;
		c=a+b;
		return c;
		
		
		
	}
	 
	 public static void main(String args[]) {
		 Testa obj = new Testa();
		 int values = obj.addPrivate();
		 System.out.println(values);
	 }

}
