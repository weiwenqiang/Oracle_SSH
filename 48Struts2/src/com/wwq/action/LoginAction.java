package com.wwq.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

public class LoginAction implements ServletRequestAware, ServletResponseAware {
	HttpServletRequest request;
	HttpServletResponse response;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void demo() {
		ServletContext s =ServletActionContext.getServletContext();
		String path = s.getRealPath("pages");
		System.out.print(path);
	}

	public String execute() {
		demo();
		HttpServletRequest hre;
		HttpServletResponse hrs;
		hre = ServletActionContext.getRequest();
		hrs=ServletActionContext.getResponse();
		if (name != null && name.equals("abc")) {
			hre.setAttribute("user", name);
			HttpSession session = hre.getSession();
			session.setAttribute("user1", age);
			return "success";
		}
		return "login";
	}
	
	private String msg;
	private String name;
	private String age;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
