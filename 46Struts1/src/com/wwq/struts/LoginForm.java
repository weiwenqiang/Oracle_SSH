package com.wwq.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm {
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


	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		if (username==null && !username.startsWith("admin")) {
			String msg="非银行卡";
			request.setAttribute("error", msg);
		}else{
			
		}
		return null;
	}
	
}
