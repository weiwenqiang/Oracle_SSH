package com.wwq.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class I18nAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String i18n(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String language = request.getParameter("l");
		String country = request.getParameter("c");
		Locale locale = new Locale(language, country);
		ActionContext.getContext().setLocale(locale);
		return INPUT;
	}
	
}
