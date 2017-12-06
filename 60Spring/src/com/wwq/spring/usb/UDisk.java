package com.wwq.spring.usb;

public class UDisk implements USB{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.print("从u盘读数据");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.print("向u盘写入数据");
		
	}
	

}
