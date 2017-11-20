package com.wwq.cinema.biz;

import java.util.Iterator;
import java.util.List;

import com.wwq.cinema.dao.TypeDAO;
import com.wwq.cinema.entity.FilmType;

public class TypeBiz {

	public List getAllType(){
		
		List result = null;
		FilmType ft = new FilmType();
		ft.setTypeId("%");
		ft.setTypeName("全部");
		try {
			TypeDAO td = new TypeDAO();
			result = td.getAllType();
			//result.add(0, ft);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		Iterator it = result.iterator();
		while(it.hasNext()){
			FilmType f = (FilmType)it.next();
			System.out.println("typeId:"+f.getTypeId()+" typeNmae:"+f.getTypeName());
			
		}
		
		return result;
	}
	
}
