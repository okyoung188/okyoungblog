package com.okyoung.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category",schema="okyoungblog")
public class Category {

	private int id;
	private String ctgName;
	private String detail;
	private Set<ArticleType> articleTypes;
	
	//数据库自增长
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getCtgName() {
		return ctgName;
	}
	public void setCtgName(String ctgname) {
		this.ctgName = ctgname;
	}
	
	@Column(name="detail")
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category",fetch=FetchType.LAZY)
	public Set<ArticleType> getArticleTypes() {
		return articleTypes;
	}
	public void setArticleTypes(Set<ArticleType> articleTypes) {
		this.articleTypes = articleTypes;
	}
	
}
