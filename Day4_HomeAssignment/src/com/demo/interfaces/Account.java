package com.demo.interfaces;

public class Account {
	String name;
	int accountNumber;
	double balance;
	int counter=0;
	
	public Account(String name,double balance) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.balance=balance;
		this.accountNumber=++counter;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber() {
		this.accountNumber =++counter;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	

}
