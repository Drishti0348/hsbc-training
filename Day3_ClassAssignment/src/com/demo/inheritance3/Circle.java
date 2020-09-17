package com.demo.inheritance3;

public class Circle extends Figure {
	
	public Circle(int dim2) {
		
		super(dim2);
	}

	@Override
	public double area() {

		return (3.14*dim2*dim2);
	}

}
