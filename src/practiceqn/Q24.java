package practiceqn;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
			
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		StringBuffer b= new StringBuffer(sc.next());
		int n = b.length()-1;
		if(b.charAt(0)==b.charAt(n)) {
			b.deleteCharAt(0);
			b.deleteCharAt(n-1);
			System.out.print(b);
			
			
		}else {
			System.out.println("no change");
			
		}
		sc.close();
	}
}
