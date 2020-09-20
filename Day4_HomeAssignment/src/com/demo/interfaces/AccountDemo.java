package com.demo.interfaces;

public class AccountDemo {

	public static void main(String[] args) {
		AccountOperationInterfaceImpl ao=new AccountOperationInterfaceImpl();
		Account a=new Account("Dris",100);
		try {
			System.out.println(ao.deposit(100,1));
		}catch(AccountBlockedException e)
		{
			System.out.println(e);
		}
	}

}
