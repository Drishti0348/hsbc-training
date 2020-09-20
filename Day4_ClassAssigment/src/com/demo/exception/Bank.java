package com.demo.exception;

public class Bank {
	
	private double balance=0.0;
	public Bank(double balance) {
		this.balance=balance;
	}
	
	public double withdraw(double amount)
	{
			try {
				if(balance<amount)
				{
					throw new LowBalanceException("low Balance");
				}
				else
				{
					System.out.println("balance="+balance);
					balance=balance-amount;
				}
			}catch(LowBalanceException e)
			{
				throw e;
			}
		return balance;
	}

}
