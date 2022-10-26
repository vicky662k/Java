package practiceqn;

public class Employe {
	int id,age;
	String name,gend,cname,add;
	Employe(){
		
	}
	Employe(int id,String n,int a,String g,String c,String ad){
		this.id=id;
		this.name=n;
		this.age=a;
		this.gend=g;
		this.cname=c;
		this.add=ad;
	}
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getGend() {
		return gend;
	}

	public String getCname() {
		return cname;
	}

	public String getAdd() {
		return add;
	}

	
	

}
