package com.okyoung.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.entity.Critique;
import com.okyoung.entity.User;
import com.okyoung.pagemodel.CritiqueModel;
import com.okyoung.service.CritiqueService;

@Service
public class CritiqueServiceImpl implements CritiqueService {
	
	@Resource
	BaseDao<Critique> baseDao;

	@Override
	public List<CritiqueModel> queryAll() throws Exception {
		List<CritiqueModel> modelList = null;
		String hql = "from Critique c order by c.time desc";
		List<Critique> critiqueList = baseDao.find(hql);
		if (critiqueList != null && critiqueList.size() > 0){
			modelList = new ArrayList<CritiqueModel>();
			CritiqueModel model = null;
			for (Critique crt: critiqueList){
				model = new CritiqueModel();
				BeanUtils.copyProperties(model, crt);
				modelList.add(model);
			}
		}	
		return modelList;
	}

	@Override
	public CritiqueModel query(int id) throws Exception  {
		CritiqueModel model = null;
		if (id > 0){
			String hql = "from Critique c where c.id=:id";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("id", id);
			Critique critique = baseDao.get(hql, paramMap);
			model = new CritiqueModel();
			BeanUtils.copyProperties(model, critique);
		}	
		return model;
	}
	
	@Override
	public List<CritiqueModel> queryByArtId(int id) throws Exception {
		List<CritiqueModel> modelList = null;
		if(id > 0){
			String hql = "from Critique c where article_id=:article_id order by c.time desc";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("article_id", Integer.valueOf(id));
			List<Critique> critiqueList = baseDao.find(hql,paramMap);
			if (critiqueList != null && critiqueList.size() > 0){
				modelList = new ArrayList<CritiqueModel>();
				CritiqueModel model = null;
				User user = null;
				for (Critique crt: critiqueList){
					model = new CritiqueModel();
					BeanUtils.copyProperties(model, crt);
					user = crt.getUser();
					if (user != null){
						String nickname = user.getNickname();
						model.setNickname(nickname);
					}
					modelList.add(model);
				}
			}		
		}
		return modelList;
	}
	
	@Override
	public void delete(int id) throws Exception {
		if (id > 0){
			Critique critique = new Critique();
			critique.setId(id);
			baseDao.delete(critique);
		}		
	}

	@Override
	public void update(CritiqueModel model) throws Exception {
		if (model != null){
			Critique critique = new Critique();
			BeanUtils.copyProperties(critique, model);
			baseDao.saveOrUpdate(critique);
		}		
	}

	@Override
	public void add(CritiqueModel model) throws Exception {
		if (model != null){
			Critique critique = new Critique();
			BeanUtils.copyProperties(critique, model);
			baseDao.save(critique);
		}
	}






}
