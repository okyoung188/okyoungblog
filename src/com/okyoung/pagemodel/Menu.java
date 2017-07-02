package com.okyoung.pagemodel;

import java.util.List;

public class Menu {
	/**
	 * Menu name
	 */
	protected String name;
	/**
	 * Menu request 
	 */
	protected String reqType;
	/**
	 * data used when requesting,sometimes equals to name. 
	 */
	protected String reqData;
	protected int size;
	protected List<Menu> subMenu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Menu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}


}
