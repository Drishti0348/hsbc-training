package com.demo.interface1;

public class PanasonicTv implements TvRemote {
	
	int price;

	public PanasonicTv(int price) {
		this.price = price;
	}

	@Override
	public int price() {

		return price;
	}

}
