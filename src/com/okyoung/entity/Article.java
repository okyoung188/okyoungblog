package com.okyoung.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "article", schema = "okyoungblog")
public class Article {

	private int id;
	private String title;
	private String content;
	private String indeximg;
	private String editor;
	private ArticleType articletype;
	private String keyword;
	private Date time;
	private Integer count;
	private String detail;
	private Set<Critique> critiques;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 6000)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "indeximg")
	public String getIndeximg() {
		return indeximg;
	}

	public void setIndeximg(String indeximg) {
		this.indeximg = indeximg;
	}

	@Column(name = "editor")
	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="type")
	public ArticleType getArticletype() {
		return articletype;
	}

	public void setArticletype(ArticleType articletype) {
		this.articletype = articletype;
	}

	@Column(name = "keyword")
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time")
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "count",nullable=true)
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "detail")
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "article")
	public Set<Critique> getCritiques() {
		return critiques;
	}

	public void setCritiques(Set<Critique> critiques) {
		this.critiques = critiques;
	}

}
