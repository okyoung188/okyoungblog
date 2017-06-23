package com.okyoung.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.okyoung.pagemodel.ArticleModel;

public interface ArticleService {
	public Logger logger = Logger.getLogger(ArticleService.class);
	
	public List<ArticleModel> listByType(String param,int pageNum,int pageSize) throws Exception;
	public List<ArticleModel> listByCtg(String param,int pageNum,int pageSize) throws Exception;
	public List<ArticleModel> listAll(int pageNum,int pageSize) throws Exception;
	public ArticleModel queryById(int id) throws Exception;
	public long countByType(String param) throws Exception;
	public long countByCtg(String param) throws Exception;
	public long countAll() throws Exception;
}
