package com.wwq.action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport {
	public InputStream getDownloadFile() {
		return ServletActionContext.getServletContext().getResourceAsStream("/file/phei.avi");
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	
}
