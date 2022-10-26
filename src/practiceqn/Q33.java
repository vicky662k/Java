package practiceqn;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Q33 {
	static Scanner sc=new Scanner(System.in);
	static List<Employe> Emplist= new ArrayList<>();
	
	public static void main(String args[]) {
		Q33 emp = new Q33();
		
		Employe E1=new Employe(1,"Ram",22,"M","EY","ABC,NewYork");
		Employe E2=new Employe(23,"Sam",40,"M","EY","ABC,India");
		Employe E3=new Employe(3,"Densy",22,"F","EY","ABC,NewYork");
		
		Emplist.add(E1);
		Emplist.add(E2);
		Emplist.add(E3);
		
		for(Employe i:Emplist) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAge()+" "+i.getGend()+" "+i.getCname()+" "+i.getAdd());
		}
		int ch,index;
		System.out.println("1.Add");
		System.out.println("2.Delete");
		System.out.println("3.Replace");
		System.out.println("4.Search");
		
		
		System.out.println("enter choice (1-4):");
		ch=sc.nextInt();
		switch(ch){
		
		case 1:	emp.add();
				break;
		
		case 2:	System.out.println("Enter id :");
				index=sc.nextInt();
				emp.remove(index);
				break;
				
		case 3: System.out.println("Enter id :");
				index=sc.nextInt();
				emp.replace(index);				
				System.out.println("Replaced Sucessfully");
				break;
				
		case 4: System.out.println("Enter id :");
				index=sc.nextInt();
				emp.search(index);
				
				break;
		default: System.out.print("Ente choice in 1-4");	   
				
		}
		for(Employe j:Emplist) {
			System.out.println(j.getId()+" "+j.getName()+" "+j.getAge()+" "+j.getGend()+" "+j.getCname()+" "+j.getAdd());
		}
	}
	
public void add() {
	int i,a;
	String n,c,ad,g;
	System.out.println("Add a new Employee:");
	
	System.out.println("Enter id:");
	i=sc.nextInt();
	System.out.println("Enter name:");
	n=sc.next();
	System.out.println("Enter age:");
	a=sc.nextInt();
	System.out.println("Enter gender:");
	g=sc.next();
	System.out.println("Enter Client name:");
	c=sc.next();
	System.out.println("Enter Address:");
	ad=sc.next();

	Employe E = new Employe(i,n,a,g,c,ad);
	Emplist.add(E);
	System.out.println("Added Sucessfully");
	
}

public void remove(int id) {
	for(Employe e :Emplist) {
		if(e.getId()==id) {
			int i=Emplist.indexOf(e);
			Emplist.remove(i);			
	}
		}
	System.out.println("Removed Sucessfully");	
}

public void replace (int id) {
	int a;
	String n,c,ad,g;
	for(Employe e :Emplist) {
		if(e.getId()==id) {
			System.out.println("Enter name:");
			n=sc.next();
			System.out.println("Enter age:");
			a=sc.nextInt();
			System.out.println("Enter gender:");
			g=sc.next();
			System.out.println("Enter Clinet name:");
			c=sc.next();
			System.out.println("Enter Address:");
			ad=sc.next();
			Employe E4 = new Employe(id,n,a,g,c,ad);
			int i=Emplist.indexOf(e);
			Emplist.set(i, E4);			
	}
		}
	System.out.println("Removed Sucessfully");		
	}

public void search(int id) {
	for(Employe e :Emplist) {
		if(e.getId()==id) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getGend()+" "+e.getCname()+" "+e.getAdd());
		}
		
	}
	
}

}


