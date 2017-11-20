package com.wwq.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction1 extends ActionSupport {
	private int number;
	private String filename;

	public InputStream getDownloadFile() throws UnsupportedEncodingException {
		if (number == 1) {
			this.filename = "1.jpg";
			this.filename = new String(this.getFilename().getBytes("gbk"),
					"utf-8");
			return ServletActionContext.getServletContext()
					.getResourceAsStream("/file/1.jpg");
		} else {
			this.filename = "3.mp3";
			this.filename = new String(this.getFilename().getBytes("gbk"),
					"utf-8");
			return ServletActionContext.getServletContext()
					.getResourceAsStream("/file/3.mp3");
		}
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
