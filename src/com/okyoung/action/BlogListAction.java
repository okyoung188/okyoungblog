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
        String ctgParam = null;
        
        //根据文章类型查找
        if (queryStr.matches("type=.+")){
        	typeParam = queryStr.replaceAll("type=(.+)", "$1");
        } else if (queryStr.matches("ctg=.+")){//根据文章目录
        	ctgParam = queryStr.replaceAll("ctg=(.+)", "$1");
        }
        
        
        if (typeParam != null && !"".equals(typeParam)){
        	
        } else if (ctgParam != null && !"".equals(ctgParam)) {
        	
        } else {
        	
        }
		return super.execute();
	}

	
	
}
