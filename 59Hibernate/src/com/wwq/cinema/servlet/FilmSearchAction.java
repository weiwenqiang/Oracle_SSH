package com.wwq.cinema.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wwq.cinema.biz.FilmBiz;
import com.wwq.cinema.util.SearchProperties;

public class FilmSearchAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();

		request.setCharacterEncoding("utf-8");
		FilmBiz fb = new FilmBiz();
		SearchProperties sp = new SearchProperties();
		String filmname = request.getParameter("filmname").trim();
		if (filmname == null || filmname.equals("")) {
			sp.setFilmname("%");
		} else {
			sp.setFilmname("%" + filmname + "%");
		}
		String typeid = request.getParameter("typeid").trim();
		if (typeid == null || typeid.equals("")) {
			sp.setTypeid("%");
		} else {
			sp.setTypeid("%" + typeid + "%");
		}
		String actor = request.getParameter("actor").trim();
		if (actor == null || actor.equals("")) {
			sp.setActor("%");
		} else {
			sp.setActor("%" + actor + "%");
		}
		String director = request.getParameter("director").trim();
		if (director == null || director.equals("")) {
			sp.setDirector("%");
		} else {
			sp.setDirector("%" + director + "%");
		}

		if (request.getParameter("smallprice") == null
				|| "".equals(request.getParameter("smallprice"))) {
			sp.setSmallprice(new Double(0));
		} else {
			sp.setSmallprice(new Double(request.getParameter("smallprice")
					.trim()));
		}

		if (request.getParameter("bigprice").trim() == null
				|| "".equals(request.getParameter("bigprice").trim())) {
			sp.setBigprice(Double.MAX_VALUE);
		} else {
			sp.setBigprice(new Double(request.getParameter("bigprice").trim()));
		}

		List result = fb.search(sp);
		request.setAttribute("result", result);
		request.getRequestDispatcher("page/result.jsp").forward(request,
				response);
		return super.execute();
	}
}
