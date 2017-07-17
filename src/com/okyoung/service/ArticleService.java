package com.okyoung.service;


import org.apache.log4j.Logger;

import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.pagemodel.Menu;
import com.okyoung.pagemodel.PageBean;
import com.okyoung.pagemodel.Position;

public interface ArticleService {
	public Logger logger = Logger.getLogger(ArticleService.class);
	
	public PageBean<ArticleModel> listByType(String param,int pageNum,int pageSize) throws Exception;
	public PageBean<ArticleModel> listByCtg(String param,int pageNum,int pageSize) throws Exception;
	public PageBean<ArticleModel> listAll(int pageNum,int pageSize) throws Exception;
	public PageBean<ArticleModel> queryById(int id) throws Exception;
	public long countByType(String param) throws Exception;
	public long countByCtg(String param) throws Exception;
	public long countAll() throws Exception;
	public Menu getMenu() throws Exception;
	public Position getPosition(String param, String queryType) throws Exception;
	public Position getPosition(int id) throws Exception;
}
