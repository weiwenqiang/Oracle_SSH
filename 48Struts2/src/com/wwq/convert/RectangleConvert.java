package com.wwq.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.wwq.vo.Rectangle;

public class RectangleConvert extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map cnotext, String[] obj, Class cls) {
		String[] str = (String[]) obj;//得到页面传入参数，允许多个输入框
		String[] ab = str[0].split(",");//分割得到的参数
		int width = Integer.parseInt(ab[0]);//数据类型转换
		int height = Integer.parseInt(ab[1]);//
		Rectangle r = new Rectangle();//构造类型对象
		r.setWidth(width);//设置
		r.setHeight(height);
		return r;//返回
	}

	@Override
	public String convertToString(Map arg0, Object obj) {
		Rectangle r = (Rectangle) obj;
		return "["+r.getWidth()+","+r.getHeight()+"]";
	}

}
