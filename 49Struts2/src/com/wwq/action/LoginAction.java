package com.wwq.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if (username == null || username.trim().equals("")) {
			String msg = "用户名称为必填项";
			this.addFieldError("username", msg);
		}
	}
	
	public String i18n(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String language = request.getParameter("l");
		String country = request.getParameter("c");
		Locale locale = new Locale(language, country);
		ActionContext.getContext().setLocale(locale);
		return INPUT;
	}

	private String username;
	private String password;
	private int age;
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
