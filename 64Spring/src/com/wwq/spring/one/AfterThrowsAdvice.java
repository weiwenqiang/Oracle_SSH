package com.wwq.spring.one;

import javax.servlet.ServletException;

import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.aop.ThrowsAdvice;
/**
 * �쳣�ļ�¼
 */
public class AfterThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, ServletException ex){
		
	}
}
