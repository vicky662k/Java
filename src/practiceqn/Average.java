package practiceqn;

import java.util.Scanner;

public class Average {
	
	
	public int getAvg(int a,int b,int c) {
		int s=(a+b+c)/3;
		return s;
	}
	public static void main(String[] args) {
		Average avg = new Average();
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		a=sc.nextInt();
		System.out.print("Enter Number 2: ");
		b=sc.nextInt();
		System.out.print("Enter Number 3: ");
		c=sc.nextInt();
		
		System.out.println("Average: "+avg.getAvg(a, b, c));
		sc.close();
	}

}
