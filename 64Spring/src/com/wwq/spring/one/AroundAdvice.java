package com.wwq.spring.one;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
	Logger logger = Logger.getLogger(this.getClass().getName());
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		logger.log(Level.INFO, "��ʼת��");
//		֪ͨĿ�귽��ִ��
		Object object = invocation.proceed();
		logger.log(Level.INFO, "ת�˽���");
		System.out.println(invocation.getMethod().getName()+"=name");
		System.out.println(invocation.getArguments()[0].toString()+"=args");
		Object[] obj = invocation.getArguments();
		System.out.println("----------------");
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i].getClass().getName()+"=object[]+name");
		}
		System.out.println("----------------");
		System.out.print(object);
		return object;
	}

}
