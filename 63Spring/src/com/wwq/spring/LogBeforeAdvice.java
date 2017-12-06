package com.wwq.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogBeforeAdvice implements MethodBeforeAdvice {
	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		logger.log(Level.INFO,"--ÊÂÇ°Ö´ÐÐ--");
	}
}
