package com.demo.interfaces;

public class InsufficientBalanceException extends RuntimeException{
	
	public String toString()
	{
		return "insufficient balance";
	}

}
