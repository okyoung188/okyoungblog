package com.okyoung.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.entity.Article;
import com.okyoung.entity.ArticleType;
import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Resource
	BaseDao<Article> baseDao;
    
	@Override
	public List<ArticleModel> listByType(String param, int pageNum, int pageSize) throws Exception {
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0 && param != null && !param.trim().equals("")){
			String hql = " from Article a where a.articleType=:type order by a.time desc";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("type", param);
			List<Article> articles = baseDao.find(hql, paramMap);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					BeanUtils.copyProperties(articleM, article);
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		return articleModels;
	}

	@Override
	public List<ArticleModel> listByCtg(String param, int pageNum, int pageSize) throws Exception {
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0 && param != null && !param.trim().equals("")){
			String hql = " from Article a left join fetch a.articleType b left join fetch b.category c where c.ctgName=:ctgName order by a.time desc";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("ctgName", param);
			List<Article> articles = baseDao.find(hql, paramMap);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					BeanUtils.copyProperties(articleM, article);
					articleModels.add(articleM);
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		return articleModels;
	}

	@Override
	public List<ArticleModel> listAll(int pageNum, int pageSize) throws Exception {
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0){
			String hql = " from Article a order by a.time desc";
			List<Article> articles = baseDao.find(hql);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					BeanUtils.copyProperties(articleM, article);
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		return articleModels;
	}

	@Override
	public ArticleModel queryById(int id) throws Exception {
		ArticleModel articleModel = null;
		if (id > 0){
			String hql = " from Article a where a.id=:id";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("id", id);
			List<Article> articles = baseDao.find(hql, paramMap);
			if (articles != null && articles.size() > 0){
				articleModel = new ArticleModel();
				Article article = articles.get(0);
				BeanUtils.copyProperties(articleModel, article);
				int critiqueSize = article.getCritiques().size();
				articleModel.setCritiqueSize(critiqueSize);
				articleModel.setArticleType(article.getArticleType().getTypeName());
				articleModel.setCtgName(article.getArticleType().getCategory().getCtgName());
			}
		}
		return articleModel;
	}

}
