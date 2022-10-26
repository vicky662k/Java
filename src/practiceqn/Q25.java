package practiceqn;

import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		StringBuffer b= new StringBuffer(sc.next());
		if(b.charAt(0)=='g')
			{b.deleteCharAt(1);}
		else if(b.charAt(1)=='h')
			{b.deleteCharAt(0);}
		else
			{b.delete(0, 2);}
		
		System.out.println("string:"+b);
		sc.close();
	}
		
		

}
