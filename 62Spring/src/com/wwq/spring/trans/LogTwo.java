package com.wwq.spring.trans;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogTwo implements MethodBeforeAdvice {
	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void before(Method method, Object[] obj, Object arg2)
			throws Throwable {
		logger.log(Level.INFO, "�ڶ��μ�¼��־");
		System.out.println(method.getName());
		for(int i = 0; i<obj.length; i++){
			/**
			 * �õ����������ķ����Ĳ����б�Ҳ�ܵõ��������������޸�
			 */
			System.out.println(obj[i]);
		}
	}
}
