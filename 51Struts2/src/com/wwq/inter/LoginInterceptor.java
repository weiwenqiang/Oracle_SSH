package com.wwq.inter;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.wwq.action.LoginAction;
import com.wwq.bean.User;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		//具体功能的实现
//		LoginAction action =(LoginAction)ai.getAction();
//		String s =ai.invoke();
		if (LoginAction.class==ai.getAction().getClass()) {
			System.out.println("Login请求，不拦截，直接通过");
			return ai.invoke();
		}
		Map session =ai.getInvocationContext().getSession();
		System.out.print("不是登录请求，拦截，并取Session处理");
		String username =((User)session.get("user")).getUsername();
		String password =((User)session.get("user")).getPassword();
		if (username==null&&username.trim().equals("")) {
			return Action.LOGIN;
		}
		return ai.invoke();
	}

}
