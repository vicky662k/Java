package com.ey.questions;

public class Emp extends Person{
	float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {
		Emp e = new Emp();
		e.setId(123);
		e.setName("RAM");
		e.setSalary(1000f);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
	}
}


