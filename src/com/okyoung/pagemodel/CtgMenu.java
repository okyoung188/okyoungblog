package com.okyoung.pagemodel;

public class CtgMenu extends Menu {
	
	public static String reqType = "ctgName";		

	{
	 super.reqType = CtgMenu.reqType;
	 super.superMenu = new BlogMenu();
	}

}
