package com.wwq.strsut;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		if (username != null && username.trim().equals("admin")) {
			setSos("��ϲ���½�ɹ�");
			setUsername(username);
			return SUCCESS;
		} else {
			return "login";
		}
	}

	private String sos;

	public String getSos() {
		return sos;
	}

	public void setSos(String sos) {
		this.sos = sos;
	}

	private String username;
	private String pw;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
