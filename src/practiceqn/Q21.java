package practiceqn;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		String a;
		int n;
		System.out.println("enter string:");
		Scanner sc = new Scanner(System.in);
		a=sc.next();
		System.out.println("enter index:");
		n=sc.nextInt();
		
		System.out.println(a.charAt(n));
		sc.close();
		
	}
}
