package com.okyoung.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.okyoung.dao.BaseDao;
import com.okyoung.entity.Manager;
import com.okyoung.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService{
	
	@Resource
	BaseDao<Manager> baseDao;

	@Override
	public List<Manager> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager query(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Manager t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Manager t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validate(String username, String pwd) throws Exception {
		if (username !=null && pwd!= null){
			String hql = "from Manager m where m.username=:username and m.pwd=:pwd";
			Map<String,Object> paramMap = new HashMap<String,Object>();
			paramMap.put("username", username);
			paramMap.put("pwd", pwd);
			Manager manager = baseDao.get(hql, paramMap);
			if (manager != null){
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
