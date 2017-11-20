package com.wwq.hibernate.two;

import java.io.Serializable;

public class Card implements Serializable {
	private int id;
	private String no;
	private PersonTwo person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public PersonTwo getPerson() {
		return person;
	}
	public void setPerson(PersonTwo person) {
		this.person = person;
	}
}
