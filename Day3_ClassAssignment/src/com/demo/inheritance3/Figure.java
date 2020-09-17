package com.demo.inheritance3;

public abstract class Figure {
	protected int dim1;
	protected int dim2;
	
	public Figure(int dim1,int dim2) {
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	public Figure(int dim2) {
		
		this.dim2=dim2;
	}
	
	abstract public double area();//can't find the area until we know the type of figure hence declared as abtsract

}
