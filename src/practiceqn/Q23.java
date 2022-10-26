package practiceqn;

import java.util.Scanner;

public class Q23 {
	public static void main(String args[]) {
		String a,b;
		System.out.println("enter string1:");
		Scanner sc = new Scanner(System.in);
		a=sc.next();
		System.out.println("enter string2:");
		b=sc.next();
		String c=a.concat(b);
		System.out.println("Concatenated String: "+c);
		System.out.println("Size of string1:"+a.length());
		if(a.length()<=b.length()) {
			System.out.println("string2:"+b+"size: "+b.length());
		}
	
sc.close();
	}
}
