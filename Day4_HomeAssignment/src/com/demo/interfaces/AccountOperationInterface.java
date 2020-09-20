package com.demo.interfaces;

public interface AccountOperationInterface {
	public double deposit(double amount,int accountNumber);
	public double withdraw(double amount,int accountNumber);
	public double getBalance(int accountNumber);
	public void blockAccount(int accountNumber);

}
