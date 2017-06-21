package com.okyoung.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.okyoung.dao.BaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Serializable save(T t) {
		if (t != null) {
			return sessionFactory.getCurrentSession().save(t);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(String hql, Map<String, Object> params) {
		if (hql != null && params != null) {
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			Set<String> keys = params.keySet();
			for (String key: keys){
				query.setParameter(key, params.get(key));
			}
			List<T> t = query.list();
			if (t != null && t.size() > 0){
				return t.get(0);
			}
		}
		return null;
	}

	@Override
	public void delete(T t) {
	    this.sessionFactory.getCurrentSession().delete(t);
	}


	@Override
	public void update(T t) {
		this.sessionFactory.getCurrentSession().update(t);		
	}
	
	@Override
	public void saveOrUpdate(T t) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(t);		
	}

	@Override
	public List<T> find(String hql) {
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<T> tList = query.list();
		return tList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql, int pageNum, int pageSize) {
		if (hql != null) {
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			return query.setFirstResult((pageNum - 1) * pageSize).setMaxResults(pageSize).list();
		}
		return null;
	}

	@Override
	public List<T> find(String hql, Map<String, Object> params) {
		if (hql != null && params != null) {
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			Set<String> keys = params.keySet();
			for (String key: keys){
				query.setParameter(key, params.get(key));
			}
			@SuppressWarnings("unchecked")
			List<T> t = query.list();
			if (t != null && t.size() > 0){
				return t;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql, Map<String, Object> params, int pageNum, int pageSize){
		if (hql != null && params != null) {
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			Set<String> keys = params.keySet();
			for (String key: keys){
				query.setParameter(key, params.get(key));
			}
			return query.setFirstResult((pageNum - 1) * pageSize).setMaxResults(pageSize).list();
		}
		return null;		
	}

	@Override
	public Long count(String hql) {
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		return (Long) query.uniqueResult();
	}

	@Override
	public Long count(String hql, Map<String, Object> params) {
		if (hql != null && params != null) {
			Query query = sessionFactory.getCurrentSession().createQuery(hql);
			Set<String> keys = params.keySet();
			for (String key: keys){
				query.setParameter(key, params.get(key));
			}
			return (Long) query.uniqueResult();
		}
		return null;
	}

	

}
