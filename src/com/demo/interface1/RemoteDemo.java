package com.demo.interface1;

public class RemoteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BPLTv b=new BPLTv(500);
		System.out.println(b.price());
		
		SonyTv s=new SonyTv(400);
		System.out.println(s.price());
		
		PanasonicTv p=new PanasonicTv(300);
		System.out.println(p.price());

	}

}
