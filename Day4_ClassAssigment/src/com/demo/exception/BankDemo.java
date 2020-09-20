package com.demo.exception;

public class BankDemo {
	public static void main(String[] args){
		Bank b=new Bank(6000);
		try {
			
			//b.withdraw(5000);
			b.withdraw(7000);
			
		}catch(LowBalanceException e)
		{
			System.out.println(e);
		}
	}

}