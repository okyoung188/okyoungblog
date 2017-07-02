package com.okyoung.pagemodel;

import java.util.List;

/**
 * 用于返回响应，包含有一些请求的参数
 * @author Harry
 *
 * @param <T> 请求类型
 */
public class PageBean<T> {

	List<T> modelList;
	long pageTotal;
	long pageNum;
	long pageSize;
	/**
	 *当前请求所在位置，借用Menu类，实际另做一个Position类比较好
	 */
	Position position;
	/**
	 * Menu tree of this app
	 */
	Menu menu;
	
	
	String reqType;
	String reqData;
	
	public List<T> getModelList() {
		return modelList;
	}
	public void setModelList(List<T> modelList) {
		this.modelList = modelList;
	}
	public long getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(long pageTotal) {
		this.pageTotal = pageTotal;
	}
	public long getPageNum() {
		return pageNum;
	}
	public void setPageNum(long pageNum) {
		this.pageNum = pageNum;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getReqType() {
		return reqType;
	}
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
	public String getReqData() {
		return reqData;
	}
	public void setReqData(String reqData) {
		this.reqData = reqData;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
