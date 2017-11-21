package com.wwq.cinema.servlet;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wwq.cinema.biz.TypeBiz;

public class TypeAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		TypeBiz tb = new TypeBiz();
		List result = tb.getAllType();
		return super.execute();
	}
}
