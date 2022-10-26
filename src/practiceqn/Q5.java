package practiceqn;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		String cm,wm,wm1,wm2,wm3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car make:");
		cm=sc.next();
		Car c = new Car(cm);
		
	
		System.out.println("enter wheel 1 make:");
		wm=sc.next();
		Car.Wheel a = c . new Wheel(wm);
		System.out.println("enter wheel 2 make:");
		wm1=sc.next();
		Car.Wheel b = c . new Wheel(wm1);
		System.out.println("enter wheel 3 make:");
		wm2=sc.next();
		Car.Wheel e = c . new Wheel(wm2);
		System.out.println("enter wheel 4 make:");
		wm3=sc.next();
		Car.Wheel d = c . new Wheel(wm3);
		
		System.out.println("CAR MAKE:"+c.getMake());
		System.out.println("WHEEL 1 MAKE:"+a.getMake());
		System.out.println("WHEEL 2 MAKE:"+b.getMake());
		System.out.println("WHEEL 3 MAKE:"+e.getMake());
		System.out.println("WHEEL 4 MAKE:"+d.getMake());
		
		
		sc.close();
		
		
	}
}

class Car{
	String make;
	
	Car(String M){
		this.make=M;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	class Wheel{
		String make;
		
		Wheel(String M){
			this.make=M;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		
	}
}
