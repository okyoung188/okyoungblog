package com.okyoung.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class BlogListAction extends ActionSupport implements ModelDriven<ArticleModel>{
	
	ArticleModel articleWithParam = new ArticleModel();
	
	List<ArticleModel> articles;
	
	@Resource
	ArticleService articleService;
	
	@Override
	public ArticleModel getModel() {
		return articleWithParam;
	}

	@Override
	public String execute() throws Exception {
        String typeParam = null;
        String ctgParam = null;
        int pageNum = articleWithParam.getPageNum();
        int pageSize = articleWithParam.getPageSize();
        // 默认页码和每页显示数目
        if (pageNum <= 0){
        	pageNum = 1;
        }
        if (pageSize <= 0){
        	pageSize = 10;
        }
//        HttpServletRequest request = ServletActionContext.getRequest();
//        String queryStr = request.getQueryString();
//
//        //根据文章类型查找
//        if (queryStr.matches("type=.+")){
//        	typeParam = queryStr.replaceAll("type=(.+)", "$1");
//        } else if (queryStr.matches("ctg=.+")){//根据文章目录
//        	ctgParam = queryStr.replaceAll("ctg=(.+)", "$1");
//        }
        typeParam = articleWithParam.getArticleType();
        ctgParam = articleWithParam.getCtgName();
        
        if (typeParam != null && !"".equals(typeParam)){
        	articles = articleService.listByType(typeParam, pageNum, pageSize);
        } else if (ctgParam != null && !"".equals(ctgParam)) {
        	articles = articleService.listByCtg(typeParam, pageNum, pageSize);
        } else {
        	articles = articleService.listAll(pageNum, pageSize);
        }
		return SUCCESS;
	}

	
	
}
