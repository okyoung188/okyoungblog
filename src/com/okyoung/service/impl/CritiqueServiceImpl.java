package com.okyoung.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.entity.Critique;
import com.okyoung.service.CritiqueService;

@Service
public class CritiqueServiceImpl implements CritiqueService {
	
	@Resource
	BaseDao<Critique> baseDao;

	@Override
	public List<Critique> queryAll() throws Exception {
		String hql = "from Critique c order by c.time desc";
		List<Critique> critiqueList = baseDao.find(hql);
		return critiqueList;
	}

	@Override
	public Critique query(int id) throws Exception  {
		String hql = "from Critique c where c.id=:id";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("id", id);
		Critique critique = baseDao.get(hql, paramMap);
		return critique;
	}
	
	@Override
	public List<Critique> queryByArtId(int id) throws Exception {
		String hql = "from Critique c where article_id=:article_id order by c.time desc";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("article_id", id);
		List<Critique> critiqueList = baseDao.find(hql);
		return critiqueList;
	}
	

	@Override
	public void delete(int id) throws Exception {
		Critique critique = new Critique();
		critique.setId(id);
		baseDao.delete(critique);
	}

	@Override
	public void update(Critique t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Critique t) throws Exception {
		// TODO Auto-generated method stub
		
	}





}
