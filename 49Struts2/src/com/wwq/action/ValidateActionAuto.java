package com.wwq.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateActionAuto extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	private String username;// ����Ӧ��
	private String password;// ����Ӧ��
	private int age;// ����Ӧ��
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
