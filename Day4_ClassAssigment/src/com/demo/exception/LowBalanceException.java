package com.demo.exception;

public class LowBalanceException extends RuntimeException{//if Exception is used instead of RuntimetimeException throw will show 
	
	public LowBalanceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	public String toString()
	{
		return "your balance is low";
	}
	

}
