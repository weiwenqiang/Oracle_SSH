package com.wwq.spring.trans;

public class TransferIMPL implements ITrans {

	@Override
	public void transfer(String name) {
		System.out.println(name+" [转账] 已记录日志");
	}

}
