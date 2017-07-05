package com.okyoung.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.pagemodel.CritiqueModel;
import com.okyoung.service.ArticleService;
import com.okyoung.service.CritiqueService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class BlogShowAction extends ActionSupport implements ModelDriven<ArticleModel>{
	@Resource
	ArticleService articleService;
	@Resource
	CritiqueService critiqueService;

	ArticleModel artModel =new ArticleModel();
	List<CritiqueModel> critiqueList;

	@Override
	public ArticleModel getModel() {
		return artModel;
	}
	
	public ArticleModel getArtModel() {
		return artModel;
	}

	public void setArtModel(ArticleModel artModel) {
		this.artModel = artModel;
	}

	public List<CritiqueModel> getCritiqueList() {
		return critiqueList;
	}

	public void setCritiqueList(List<CritiqueModel> critiqueList) {
		this.critiqueList = critiqueList;
	}

	@Override
	public String execute() throws Exception {
		int id = artModel.getId();
		if (id > 0) {
			artModel = articleService.queryById(id);
			critiqueList = critiqueService.queryByArtId(id);
			return SUCCESS;
		} else{
			return ERROR;
		}
	}




}
