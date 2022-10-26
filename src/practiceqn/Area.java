package practiceqn;

import java.util.Scanner;

public class Area {
	int len,bred;
	
	public void setDim(int l,int b) {
		this.len=l;
		this.bred=b;
		
	}
	public int getArea() {
		int a;
		a=this.len*this.bred;
		return a;
	}
	public static void main(String[] args) {
		int l,b;
		Area a = new Area();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		l=sc.nextInt();
		System.out.print("Enter breadth: ");
		b=sc.nextInt();
		a.setDim(l,b);
		System.out.print("Area: "+a.getArea());
		sc.close();
	}

}
