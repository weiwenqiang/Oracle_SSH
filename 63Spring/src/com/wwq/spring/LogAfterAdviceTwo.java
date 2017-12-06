package com.wwq.spring;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogAfterAdviceTwo implements AfterReturningAdvice {
	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void afterReturning(Object obj, Method method, Object[] obj1,
			Object obj2) throws Throwable {
		logger.log(Level.INFO,"--�º�ִ��--");
		System.out.println(method.getName());
		for(int i=0; i<obj1.length; i++){
			System.out.println(obj1[i]);
		}
		System.out.println("�����õ��������صĲ����� "+obj);
		System.out.println("�����õ�Ŀ����� "+obj2);
	}
}
