package com.wwq.cinema.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wwq.cinema.biz.FilmBiz;
import com.wwq.cinema.entity.FilmInfo;

public class FilmAddAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		HttpServletRequest request =ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		request.setCharacterEncoding("utf-8");
		FilmBiz fb = new FilmBiz();
		FilmInfo fi = new FilmInfo();
		fi.setFilmName(request.getParameter("filmname").trim());
		fi.setTypeId(request.getParameter("typeid").trim());
		String actor = request.getParameter("actor").trim();
		if(actor == null && "".equals(actor)){
			fi.setActor("暂无");
		}else{
			fi.setActor(actor);
		}
		String director = request.getParameter("director").trim();
		if(director ==null && "".equals(director)){
			fi.setDirector("暂无");		
		}else{
			fi.setDirector(director);
		}
		fi.setTicketPrice(Long.parseLong(request.getParameter("ticketprice").trim()));
		boolean result = fb.add(fi);
		if(result){
			request.setAttribute("result","添加成功!!!!"+"<a href='index.jsp'>首页</a>" );
		}else{
			request.setAttribute("result","添加失败"+"<a href='page/add.jsp'>返回</a>");
		}
		request.getRequestDispatcher("page/success.jsp").forward(request, response);
		return super.execute();
	}
}
