package com.okyoung.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.dao.impl.CategoryDaoImpl;
import com.okyoung.entity.Article;
import com.okyoung.entity.ArticleType;
import com.okyoung.entity.Category;
import com.okyoung.pagemodel.ATypeMenu;
import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.pagemodel.BlogMenu;
import com.okyoung.pagemodel.CtgMenu;
import com.okyoung.pagemodel.Menu;
import com.okyoung.pagemodel.PageBean;
import com.okyoung.service.ArticleService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	
	@Resource
	BaseDao<Article> baseDao;
	@Resource
	CategoryDaoImpl categoryDao;
    
	@Override
	public PageBean<ArticleModel> listByType(String param, int pageNum, int pageSize) throws Exception {
		PageBean<ArticleModel> pageBean = new PageBean<ArticleModel>();
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0 && param != null && !param.trim().equals("")){
			String hql = " from Article a where type=:type order by a.time desc";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("type", param);
			List<Article> articles = baseDao.find(hql, paramMap,pageNum,pageSize);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					articleM.setRmHtml(true);
					BeanUtils.copyProperties(articleM, article);
					articleM.setIndeximg(article.getIndeximg());
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		long count = countByType(param);
		long pageTotal = count % pageSize == 0 ? (count/pageSize) : (count/pageSize +1);
		pageBean.setModelList(articleModels);
		pageBean.setPageTotal(pageTotal);
		pageBean.setPageNum(pageNum);
		pageBean.setPageSize(pageSize);
		pageBean.setReqData(param);
		pageBean.setReqType(ATypeMenu.reqType);
		return pageBean;
	}

	@Override
	public PageBean<ArticleModel> listByCtg(String param, int pageNum, int pageSize) throws Exception {
		PageBean<ArticleModel> pageBean = new PageBean<ArticleModel>();
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0 && param != null && !param.trim().equals("")){
			String hql = "select a from Article a left join fetch a.articleType b left join fetch b.category c where c.ctgName=:ctgName order by a.time desc";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("ctgName", param);
			List<Article> articles = baseDao.find(hql, paramMap,pageNum,pageSize);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					articleM.setRmHtml(true);
					BeanUtils.copyProperties(articleM, article);
					articleM.setIndeximg(article.getIndeximg());
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		long count = countByCtg(param);
		long pageTotal = count % pageSize == 0 ? (count/pageSize) : (count/pageSize +1);
		pageBean.setModelList(articleModels);
		pageBean.setPageTotal(pageTotal);
		pageBean.setPageNum(pageNum);
		pageBean.setPageSize(pageSize);
		pageBean.setReqData(param);
		pageBean.setReqType(CtgMenu.reqType);
		return pageBean;
	}

	@Override
	public PageBean<ArticleModel> listAll(int pageNum, int pageSize) throws Exception {
		PageBean<ArticleModel> pageBean = new PageBean<ArticleModel>();
		List<ArticleModel> articleModels = null;
		if (pageNum > 0 && pageSize > 0){
			String hql = " from Article a order by a.time desc";
			List<Article> articles = baseDao.find(hql,pageNum,pageSize);
			if (articles != null && articles.size() > 0){
				articleModels = new ArrayList<ArticleModel>();
				ArticleModel articleM = null;
				for (Article article : articles){
					articleM = new ArticleModel();
					articleM.setRmHtml(true);
					BeanUtils.copyProperties(articleM, article);
					articleM.setIndeximg(article.getIndeximg());
					int critiqueSize = article.getCritiques().size();
					articleM.setCritiqueSize(critiqueSize);
					articleM.setArticleType(article.getArticleType().getTypeName());
					articleM.setCtgName(article.getArticleType().getCategory().getCtgName());
					articleModels.add(articleM);
				}
			}
		}
		long count = countAll();
		long pageTotal = count % pageSize == 0 ? (count/pageSize) : (count/pageSize +1);
		pageBean.setModelList(articleModels);
		pageBean.setPageTotal(pageTotal);
		pageBean.setPageNum(pageNum);
		pageBean.setPageSize(pageSize);
		return pageBean;
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
				articleModel.setIndeximg(article.getIndeximg());
				int critiqueSize = article.getCritiques().size();
				articleModel.setCritiqueSize(critiqueSize);
				articleModel.setArticleType(article.getArticleType().getTypeName());
				articleModel.setCtgName(article.getArticleType().getCategory().getCtgName());
			}
		}
		return articleModel;
	}

	@Override
	public long countByType(String param) throws Exception {
		if (param != null && !param.trim().equals("")){
			String hql = " from Article a where type=:type";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("type", param);
			String hqlCount = "select count(*)";
			long total = baseDao.count(hqlCount + hql, paramMap);
			return total;
		}
		return 0;
	}

	@Override
	public long countByCtg(String param) throws Exception {
		if (param != null && !param.trim().equals("")){
			String hql = " from Article a left join a.articleType b left join b.category c where c.ctgName=:ctgName";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("ctgName", param);
			String hqlCount = "select count(*)";
			return baseDao.count(hqlCount + hql, paramMap);			
		}
		return 0;
	}

	@Override
	public long countAll() throws Exception {
		String hql = "select count(*) from Article a";
		return baseDao.count(hql);
	}

	@Override
	public Menu getMenu() throws Exception {
		String hql = "select c from Category c";
		List<Category> ctgs = categoryDao.find(hql);
		Menu ctgMenu = null;
		Menu blogMenu =new BlogMenu();
		List<Menu> ctgMenus = new ArrayList<Menu>();
		for (Category category:ctgs){
			ctgMenu = new CtgMenu();
			ctgMenu.setName(category.getCtgName());
			ctgMenu.setReqData(category.getCtgName());
			Set<ArticleType> types =  category.getArticleTypes();
			Menu typeMenu;
			List<Menu> typeMenus = new ArrayList<Menu>();
			int num = 0;
            for(ArticleType type: types){
            	typeMenu = new ATypeMenu();
            	typeMenu.setName(type.getTypeName());
            	typeMenu.setReqData(type.getTypeName());
            	int size = type.getArticles().size();
            	num+= size;
            	typeMenu.setSize(size);
            }
            ctgMenu.setSize(num);
            ctgMenu.setSubMenu(typeMenus);
            ctgMenus.add(ctgMenu);
		}
		blogMenu.setSubMenu(ctgMenus);
		return blogMenu;
	}

	@Override
	public Menu getPosition(String param,String queryType) throws Exception {
		Menu menu = null;
		if (queryType!= null && queryType.equals(CtgMenu.reqType)) {
            menu = new CtgMenu();
            menu.setName(param);
            menu.setReqData(param);
		} else if (queryType!= null && queryType.equals(ATypeMenu.reqType)) {
            menu = new ATypeMenu();
            Menu ctgMenu = new CtgMenu();
            String hql = "select c from ArticleType b left join b.category c where b.typeName=:name";
            Map<String,Object> paramMap = new HashMap<String,Object>();
            paramMap.put("name", param);
            List<Category> catList = categoryDao.find(hql, paramMap);
            String catName = catList.get(0).getCtgName();
            ctgMenu.setName(catName);
            ctgMenu.setReqData(catName);
            menu.setName(param);
            menu.setReqData(param);
            menu.setSuperMenu(ctgMenu);
		}
		return menu;
	}

	


}
