package com.demo.interface1;

public class BPLTv implements TvRemote {
	int price;

	public BPLTv(int price) {
		this.price = price;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return price;
	}
}
