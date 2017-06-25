package com.okyoung.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.pagemodel.PageBean;
import com.okyoung.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

@Controller
public class BlogListAction extends ActionSupport implements ModelDriven<ArticleModel>{
	Logger logger  = Logger.getLogger(BlogListAction.class);
	
	ArticleModel articleWithParam = new ArticleModel();
	PageBean<ArticleModel> pageBean;
	List<ArticleModel> articles;
	String reqType;
	String reqData;
	
	public List<ArticleModel> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleModel> articles) {
		this.articles = articles;
	}

	@Resource
	ArticleService articleService;
	
	@Override
	public ArticleModel getModel() {
		return articleWithParam;
	}

	@Override
	public String execute() throws Exception {
        int pageNum = articleWithParam.getPageNum();
        int pageSize = articleWithParam.getPageSize();
        String articleType = articleWithParam.getArticleType();
        String ctgName = articleWithParam.getCtgName();
        
        logger.info(ServletActionContext.getRequest().getCharacterEncoding());
        logger.info("typeParam:" + articleType);
        logger.info("ctgParam:" + ctgName);
        
        if (articleType != null && !"".equals(articleType)){
        	pageBean = articleService.listByType(reqData, pageNum,pageSize);
        } else if (ctgName != null && !"".equals(ctgName)) {
        	pageBean = articleService.listByCtg(reqData, pageNum, pageSize);
        } else {
        	pageBean = articleService.listAll(pageNum, pageSize);
        }  
        ValueStack valueStack = ServletActionContext.getContext().getValueStack();
        valueStack.push(pageBean);
		return SUCCESS;
	}

	
	
}
