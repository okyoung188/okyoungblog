package com.okyoung.pagemodel;


public class Position {
	protected String name;
	protected String reqType;
	protected String reqData;
	protected Position subPosition;
	
	public Position() {
		super();
	}
	
	public Position(String name, String reqType, String reqData) {
		super();
		this.name = name;
		this.reqType = reqType;
		this.reqData = reqData;
	}
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
	public Position getSubPosition() {
		return subPosition;
	}
	public void setSubPosition(Position subPosition) {
		this.subPosition = subPosition;
	}

	@Override
	public String toString() {
		return "Position [name=" + name + ", reqType=" + reqType + ", reqData="
				+ reqData + ", subPosition=" + subPosition + "]";
	}
	
	

}
