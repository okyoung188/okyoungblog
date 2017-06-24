package com.okyoung.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

@Controller
public class BlogListAction extends ActionSupport implements ModelDriven<ArticleModel>{
	Logger logger  = Logger.getLogger(BlogListAction.class);
	
	ArticleModel articleWithParam = new ArticleModel();
	
	List<ArticleModel> articles;
	long pageTotal;
	int pageNum;
	int pageSize;
	
	public List<ArticleModel> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleModel> articles) {
		this.articles = articles;
	}

	public long getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(long pageTotal) {
		this.pageTotal = pageTotal;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

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
        pageNum = articleWithParam.getPageNum();
        pageSize = articleWithParam.getPageSize();
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
        logger.info(ServletActionContext.getRequest().getCharacterEncoding());
        logger.info("typeParam:" + typeParam);
        logger.info("ctgParam:" + ctgParam);
        if (typeParam != null && !"".equals(typeParam)){
        	articles = articleService.listByType(typeParam, pageNum,pageSize);
        	pageTotal = articleService.countByType(typeParam) % pageSize == 0 ? (articleService.countByType(typeParam)/pageSize) : (articleService.countByType(typeParam)/pageSize +1);
        } else if (ctgParam != null && !"".equals(ctgParam)) {
        	articles = articleService.listByCtg(typeParam, pageNum, pageSize);
        	pageTotal = articleService.countByCtg(ctgParam) % pageSize == 0 ? (articleService.countByCtg(ctgParam)/pageSize) : (articleService.countByCtg(ctgParam)/pageSize +1);
        } else {
        	articles = articleService.listAll(pageNum, pageSize);
        	pageTotal = articleService.countAll() % pageSize == 0 ? (articleService.countAll()/pageSize) : (articleService.countAll()/pageSize +1);
        }
        ValueStack valuestack = ServletActionContext.getContext().getValueStack();
		return SUCCESS;
	}

	
	
}
