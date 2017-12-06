package com.wwq.spring.two;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
public class LogBeforeAdvice {
	Logger logger = Logger.getLogger(this.getClass().getName());
	@Before("execution(* com.wwq.spring.two.User*.*(..))")
	public void before(){
		logger.log(Level.INFO,"Ö´ÐÐ");
	}
}
