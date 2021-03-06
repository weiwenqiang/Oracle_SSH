package com.wwq.hibernate.image;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

public class Image implements Serializable {
	private int id;
	private Date date;
	private Blob file;
	private Clob text;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Blob getFile() {
		return file;
	}

	public void setFile(Blob file) {
		this.file = file;
	}

	public Clob getText() {
		return text;
	}

	public void setText(Clob text) {
		this.text = text;
	}


}
