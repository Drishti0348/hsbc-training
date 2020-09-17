package com.demo.inheritance3;

public class Square extends Figure {
	
	public Square(int dim1, int dim2) {

		super(dim1, dim2);
	}

	@Override
	public double area() {

		return dim1 * dim2;
	}

}
