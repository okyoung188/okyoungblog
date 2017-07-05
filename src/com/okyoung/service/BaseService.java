package com.okyoung.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.okyoung.entity.Critique;

public interface BaseService<T> {
   public static final Logger logger = Logger.getLogger(BaseService.class);
   
   public List<T> queryAll() throws Exception;
   
   public T query(int id) throws Exception;
   
   public void delete(int id) throws Exception;
   
   public void update(T t) throws Exception;   
   
   public void add(T t) throws Exception;

}
