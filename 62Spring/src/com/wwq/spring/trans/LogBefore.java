package com.wwq.spring.trans;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice {
	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void before(Method method, Object[] obj, Object arg2)
			throws Throwable {
		logger.log(Level.INFO, "转账开始执行");
		System.out.println(method.getName());
		for(int i = 0; i<obj.length; i++){
			/**
			 * 得到被代理对象的方法的参数列表，也能得到被代理，但补能修改
			 */
			System.out.println(obj[i]);
		}
	}
}
