package com.okyoung.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;


public interface BaseDao<T> {
	Logger logger = Logger.getLogger(BaseDao.class);
	
	public Serializable save(T t);
	
	public void delete(T t);
	
	public void update(T t);
	
	public void saveOrUpdate(T t);
	
	public T get(String hql, Map<String, Object> params);
	
	/**
	 * 查找数据
	 * @param hql
	 * @return
	 */
	public List<T> find(String hql);
	
	/**
	 * 翻页查找
	 * @param hql
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<T> find(String hql, int pageNum, int pageSize);
	
	public List<T> find(String hql, Map<String, Object> params);
	
	public List<T> find(String hql, Map<String, Object> params, int pageNum, int pageSize);
	
	public Long count(String hql);
	
	public Long count(String hql, Map<String, Object> params);

}
