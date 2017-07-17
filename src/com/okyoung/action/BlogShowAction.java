package com.okyoung.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.pagemodel.CritiqueModel;
import com.okyoung.pagemodel.Menu;
import com.okyoung.pagemodel.PageBean;
import com.okyoung.pagemodel.Position;
import com.okyoung.service.ArticleService;
import com.okyoung.service.CritiqueService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

@Controller
@Scope("prototype")
public class BlogShowAction extends ActionSupport implements ModelDriven<ArticleModel>{
	@Resource
	ArticleService articleService;
	@Resource
	CritiqueService critiqueService;

	ArticleModel artModel =new ArticleModel();
	List<CritiqueModel> critiqueList;
	Menu menu;
	List<Position> positionList;

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
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public List<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}

	@Override
	public String execute() throws Exception {
		int id = artModel.getId();
		if (id > 0) {
			PageBean<ArticleModel> pageBean = articleService.queryById(id);
			if(pageBean != null){
				if(pageBean.getModelList() != null){
					artModel = pageBean.getModelList().get(0);
				}				
				critiqueList = critiqueService.queryByArtId(id);
				menu = articleService.getMenu();
				positionList = pageBean.getPositionList();
			}		
			return SUCCESS;
		} else{
			return ERROR;
		}
	}




}
