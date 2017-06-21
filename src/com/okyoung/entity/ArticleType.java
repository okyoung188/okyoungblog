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
@Table(name = "articletype", schema = "okyoungblog")
public class ArticleType {

	private int id;
	private String typename;
	private String detail;
	private Set<Article> articles;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 数据库自增长
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "typename")
	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Column(name = "detail")
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articletype", cascade = CascadeType.ALL)
	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

}
