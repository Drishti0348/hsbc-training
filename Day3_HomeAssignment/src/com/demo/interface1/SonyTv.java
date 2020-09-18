package com.demo.interface1;

public class SonyTv implements TvRemote {
	
	int price;

	public SonyTv(int price) {
		this.price = price;
	}

	@Override
	public int price() {

		return price;
	}

}
