package com.wwq.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
@Aspect
public class LogAfterAdviceThree{
	Logger logger = Logger.getLogger(this.getClass().getName());

	@After("execution(* com.wwq.spring.UserDaoimpl.*(..))")
	public void afterReturning(Object obj, Method method, Object[] obj1,
			Object obj2) throws Throwable {
		logger.log(Level.INFO,"--事后执行--");
		System.out.println(method.getName());
		for(int i=0; i<obj1.length; i++){
			System.out.println(obj1[i]);
		}
		System.out.println("可以拿到方法返回的参数： "+obj);
		System.out.println("可以拿到目标对象： "+obj2);
	}
}
