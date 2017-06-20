package com.okyoung.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class BlogListAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        String queryStr = request.getQueryString();
        String typeParam = null;
        String ctlgParam = null;
        if (queryStr.matches("type=.+")){
        	
        } else if (queryStr.matches("ctlg=.+")){
        	
        } else {
        	
        }
        
        if (typeParam != null && typeParam.matches("type=.+")){
        	String param = typeParam.replaceAll("type=(.+)","$1");
        	
        }
		return super.execute();
	}

	
	
}
