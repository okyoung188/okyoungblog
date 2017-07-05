package com.okyoung.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.entity.Category;
import com.okyoung.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Resource
	BaseDao<Category> baseDao;

	@Override
	public List<Category> queryAll() throws Exception {
		String hql = "from Category c";
		List<Category> categoryList = baseDao.find(hql);
		return categoryList;
	}

	@Override
	public Category query(int id) throws Exception {
		Category category = null;
		if(id > 0){
			String hql = "from Category c where c.id=:id";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("id", id);
			category = baseDao.get(hql, paramMap);
		}
		return category;
	}

	@Override
	public void delete(int id) throws Exception {
		if(id > 0){
			Category category = new Category();
			category.setId(id);
			baseDao.delete(category);
		}
	}

	@Override
	public void update(Category category) throws Exception {
		if(category != null){
		    baseDao.update(category);	
		}
	}

	@Override
	public void add(Category category) throws Exception {
		if(category != null){
		   baseDao.save(category);	
		}
	}

}
