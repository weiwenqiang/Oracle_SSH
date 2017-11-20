package com.wwq.cinema.biz;

import java.util.List;

import com.wwq.cinema.dao.FilmDAO;
import com.wwq.cinema.entity.FilmInfo;
import com.wwq.cinema.util.SearchProperties;

public class FilmBiz {

	public List search(SearchProperties sp){ 
		List result = null;	
		FilmDAO fd = new FilmDAO();
		System.out.println("actor"+sp.getActor()+"::"+"Filmname"+sp.getFilmname()+"::" +"Typeid"+sp.getTypeid()+"::" );
		try {
			result = fd.search(sp);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return result;	
	}
    //增加电影信息
	public boolean add(FilmInfo item){ 
		FilmDAO fd = new FilmDAO();		
		try {
			fd.add(item);			
		} catch (RuntimeException e) {
			e.printStackTrace();
			return false;
		}
		return true;		
	}
	
	
	
}
