package com.wwq.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginform = (LoginForm)form;
		String username = loginform.getUsername();
		String pw = loginform.getPw();
		if (username != null && username.startsWith("62")) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("fail");
		}
	}
}
