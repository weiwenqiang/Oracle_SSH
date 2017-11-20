package com.wwq.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.wwq.vo.Rectangle;

public class RectangleConvert extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map cnotext, String[] obj, Class cls) {
		String[] str = (String[]) obj;//�õ�ҳ�洫������������������
		String[] ab = str[0].split(",");//�ָ�õ��Ĳ���
		int width = Integer.parseInt(ab[0]);//��������ת��
		int height = Integer.parseInt(ab[1]);//
		Rectangle r = new Rectangle();//�������Ͷ���
		r.setWidth(width);//����
		r.setHeight(height);
		return r;//����
	}

	@Override
	public String convertToString(Map arg0, Object obj) {
		Rectangle r = (Rectangle) obj;
		return "["+r.getWidth()+","+r.getHeight()+"]";
	}

}
