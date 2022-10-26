package com.ey.src;

public class Encapsultion {
	
	int rollno,age;
	String name;
	
	public Encapsultion(int r,int a,String n) {
		this.rollno=r;
		this.age=a;
		this.name=n;
	}
	
	public void display() {
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(name);
	}
	
	public void setrollno(int r) {
		this.rollno=r;
	}
	public void setage(int a) {
		this.age=a;
	}
	public void setname(String n) {
		this.name=n;
	}
	public int getrollno() {
		return rollno;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}

}
