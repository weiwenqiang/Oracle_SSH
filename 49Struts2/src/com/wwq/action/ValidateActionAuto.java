package com.wwq.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateActionAuto extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	private String username;// 表单对应域
	private String password;// 表单对应域
	private int age;// 表单对应域
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
