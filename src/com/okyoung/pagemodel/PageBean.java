package com.okyoung.pagemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于返回响应，包含有一些请求的参数
 * @author Harry
 *
 * @param <T> 请求类型
 */
public class PageBean<T> {


	String reqType;
	String reqData;
	long pageTotal;
	long pageNum;
	long pageSize;
	/**
	 *当前请求所在位置，借用Menu类，实际另做一个Position类比较好
	 */
	Position position;
	List<Position> positionList;
	/**
	 * Menu tree of this app
	 */
	Menu menu;
	List<T> modelList;
	
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
		Position pos = position;
		List<Position> positionList = null;
		while (pos != null){
			if(positionList == null){
				positionList = new ArrayList<Position>();
			}
			positionList.add(pos);
			pos = pos.getSubPosition();
		}
		setPositionList(positionList);
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
	public List<Position> getPositionList() {
		return positionList;
	}
	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}

}
