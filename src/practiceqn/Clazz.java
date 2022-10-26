package practiceqn;

import java.util.Scanner;

public class Clazz {
	public static void main(String[] args) {
		String s;
		outer o=new outer();
		//inner i=new inner();
		outer.inner i = o. new inner();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string:");
		s=sc.next();
		i.describe(s);
		sc.close();
	}

}
class outer{
	
	class inner{
		public void describe(String str) {
			
			System.out.println("String:"+str);
			
		}
	}
	
}
