package com.okyoung.pagemodel;

import java.util.Date;

import com.okyoung.entity.User;

public class CritiqueModel {
	private int id;
	private int articleId;
	private int userId;
	private Date time;
	private String detail;
	private String content;
	private String nickname;
	private String email;
	private String personalPage;
	private boolean rememberInfo;

	
	public CritiqueModel(){
		time = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonalPage() {
		return personalPage;
	}

	public void setPersonalPage(String personalPage) {
		this.personalPage = personalPage;
	}

	public boolean isRememberInfo() {
		return rememberInfo;
	}

	public void setRememberInfo(boolean rememberInfo) {
		this.rememberInfo = rememberInfo;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CritiqueModel [id=" + id + ", articleId=" + articleId
				+ ", userId=" + userId + ", time=" + time + ", detail="
				+ detail + ", content=" + content + ", nickname=" + nickname
				+ ", email=" + email + ", personalPage=" + personalPage
				+ ", rememberInfo=" + rememberInfo + "]";
	}
	
	
}
