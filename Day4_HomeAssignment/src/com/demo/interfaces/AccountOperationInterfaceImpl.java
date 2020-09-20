package com.demo.interfaces;

public class AccountOperationInterfaceImpl implements AccountOperationInterface {

	double balance;
	Account a[]=new Account[5];
	
		
	@Override
	public double deposit(double amount,int accountNumber) {
		
		try
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getAccountNumber()==accountNumber)
				{
					this.balance=a[i].getBalance()+amount;
					a[i].setBalance(balance);
					return a[i].getBalance();
				}
				
			}
			throw new AccountBlockedException();
		}
		finally
		{
			System.out.println("deposited");
		}
		
	}

	@Override
	public double withdraw(double amount,int accountNumber) {

		try {
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getAccountNumber()==accountNumber)
				{
					if(a[i].getBalance()>=amount)
					{
						this.balance=a[i].getBalance()-amount;
						a[i].setBalance(balance);
						return a[i].getBalance();
					}
					else
						throw new InsufficientBalanceException();
				}
				
			}
			throw new AccountBlockedException();
				
		}finally
		{
			System.out.println("withrawed");
		}
	}

	@Override
	public double getBalance(int accountNumber) {
		try {
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getAccountNumber()==accountNumber)
				{
					return a[i].getBalance();
				}
			}
			throw new AccountBlockedException();
		}
		finally
		{
			System.out.println("balance displayed");
		}
	}

	@Override
	public void blockAccount(int accountNumber) {
		
			for(int i=0;i<a.length;i++)
			{
				if(a[i].getAccountNumber()==accountNumber)
				{
					a[i]=null;
					break;
				}
			}

		}
}
