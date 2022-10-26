package practiceqn;

import java.util.Scanner;

public class Q22 {
	
	public static void main(String[] args) {
		
	String a,b;
	System.out.println("enter string1:");
	Scanner sc = new Scanner(System.in);
	a=sc.next();
	System.out.println("enter string2:");
	b=sc.next();
	if(a.compareTo(b)==0) {
				
						System.out.println("Strings are lexigrophically equal.");
								}else
						System.out.println("String are not lexigrophically equal");
					
	sc.close();
	}


}
