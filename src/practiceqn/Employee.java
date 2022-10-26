package practiceqn;

import java.util.Scanner;

public class Employee {
	
	float salary;
	String name,add;
	int yoj;
	
	Employee(String n,String ad,float s,int y){
		this.name=n;
		this.add=ad;
		this.salary=s;
		this.yoj=y;
		
	}
	
	public int getYoj() {
		return yoj;
	}

	public float getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public String getAdd() {
		return add;
	}

	
	
	
	public static void main(String[] args) {
		String n,a;
		int y;
		float s;
		Scanner sc =new Scanner(System.in);
		Employee[] E=new Employee[3];
		for(int i =0;i<3;i++) {
			System.out.println("Enter name:");
			n=sc.next();
			System.out.println("Enter address:");
			a=sc.next();
			System.out.println("Enter salary:");
			s=sc.nextFloat();
			System.out.println("Enter Year of Joining:");
			y=sc.nextInt();
			E[i]=new Employee(n,a,s,y);
			
		}
		
		System.out.println("Name\t\tYear of Joining\t\tAddress");
		for(int i =0;i<3;i++) {
		System.out.println(E[i].getName()+"\t\t"+E[i].getYoj()+"\t\t"+E[i].getAdd());
		}
	sc.close();	
	}
	
		
		
	}
	
	
	

