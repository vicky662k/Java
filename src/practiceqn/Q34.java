package practiceqn;

import java.util.ArrayList;
import java.util.Scanner;

public class Q34 {
	public static void main(String args[]) {
		ArrayList<String> a=new ArrayList<String>();
		String b;
		int c;
		a.add("e");
		a.add("j");
		a.add("s");
		System.out.println("enter element:");
		Scanner sc = new Scanner(System.in);
		b=sc.next();
		System.out.println("enter index:");
		c=sc.nextInt();
		a.add(c,b);
		System.out.println(a);
		
		sc.close();
		}
}
