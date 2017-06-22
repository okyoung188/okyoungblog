package com.okyoung.pagemodel;

import java.util.Date;
import java.util.Set;

import com.okyoung.entity.ArticleType;
import com.okyoung.entity.Critique;

public class ArticleModel {
	private int id;
	private String title;
	private String content;
	private String indeximg;
	private String editor;
	private String articletype;
	private String keyword;
	private Date time;
	private Integer count;
	private String detail;
	private Set<String> critiques;
	
	
}
