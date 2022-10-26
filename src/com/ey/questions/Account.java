package com.ey.questions;

public class Account {
	
	long account_no;
	String name,email;
	float amount;
	
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public static void main(String args[]) {
		Account a =new Account();
		a.setAccount_no(94950);
		a.setName("RAM");
		a.setEmail("ram@gmail.com");
		a.setAmount(1000f);
		System.out.println(a.getAccount_no());
		System.out.println(a.getName());
		System.out.println(a.getEmail());
		System.out.println(a.getAmount());
		
	}

}
