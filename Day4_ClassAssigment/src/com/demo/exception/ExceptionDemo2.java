package com.demo.exception;

import javax.management.RuntimeErrorException;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		System.out.println("start program");
		
		try {
			//System.out.println(names[2].length());
			
			//throw new RuntimeException();//this will be catched by (Exception e)
		System.out.println("no exception found");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (NullPointerException e) {
			System.out.println(e);

		}
		catch (Exception e) {
			System.out.println(e);

		}
		finally {
			System.out.println("this is finally block");
		}
		
		System.out.println("end program");
	}

}
