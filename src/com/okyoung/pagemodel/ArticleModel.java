package com.okyoung.pagemodel;

import java.util.Date;
import java.util.Set;

import com.okyoung.entity.ArticleType;
import com.okyoung.entity.Critique;

public class ArticleModel {
	
	private int id;// two way
	private String title;// two way
	private String content;
	private String indeximg;
	private String editor;
	private String keyword;// two way
	private Date time;
	private Integer viewCount;
	private String detail;
	private int critiqueSize;
	
	private String articleType;// two way
	private String ctgName;
	private int pageNum = -1;
	private int pageSize = 10;
	private int pageTotal;
	
	
	public String getArticleType() {
		return articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
	public String getCtgName() {
		return ctgName;
	}
	public void setCtgName(String ctgName) {
		this.ctgName = ctgName;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}	
	public int getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIndeximg() {
		return indeximg;
	}
	public void setIndeximg(String indeximg) {
		this.indeximg = indeximg;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getCritiqueSize() {
		return critiqueSize;
	}
	public void setCritiqueSize(int critiqueSize) {
		this.critiqueSize = critiqueSize;
	}
	
	
	
	
	
	
}
