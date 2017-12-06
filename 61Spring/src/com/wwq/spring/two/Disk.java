package com.wwq.spring.two;
public class Disk implements USB{

	@Override
	public void read() {
		// TODO Auto-generated method stub]
		System.out.print("从移动硬盘读数据");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.print("向移动硬盘写数据");
		
	}

}
