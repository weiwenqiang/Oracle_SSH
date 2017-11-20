package com.wwq.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File file;
	private String fileContentType;
	private String fileFileName;
	private String msg;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String execute() throws Exception {
		String folder = ServletActionContext.getServletContext().getRealPath("file");
		// 取到了扩展名
		String type = this.getFileFileName().substring(
				this.getFileFileName().lastIndexOf("."));
		System.out.print(type);
		// 拼接上传文件存放的完整路径
//		String str[] = { ".exe", ".bat" };
		if (type.equals(".exe")||type.equals(".bat")) {
			return "input";
		}
		//个人运行结果，后缀重复，可能不需要加后缀，如后续有错误可以再加type
		String outputname = folder + File.separator + fileFileName + type;
//		String outputname = folder + File.separator + fileFileName;
		File outFile = new File(outputname);
		FileUtils.copyFile(this.getFile(), outFile);
		return "success";
	}
	
	
}
