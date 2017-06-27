package com.okyoung.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class BlogShowAction extends ActionSupport implements ModelDriven<ArticleModel>{

	ArticleModel artModel =new ArticleModel();
	@Resource
	ArticleService articleServcie;
	
	@Override
	public ArticleModel getModel() {
		return artModel;
	}
	
	@Override
	public String execute() throws Exception {
		int id = artModel.getId();
		if (id > 0) {
			artModel = articleServcie.queryById(id);
			return SUCCESS;
		} else{
			return ERROR;
		}
	}




}
