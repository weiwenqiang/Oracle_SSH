package com.wwq.spring.three;

public class PersonFactory {
	public TrendsPerson createPerson(){
		System.out.println("��������");
		return new TrendsPerson();
	}
}
