package com.okyoung.util;

import net.sf.json.JSONObject;

public class JsonUtil {

	/**
	 * Default 结果为false
	 */
	private boolean success = false;

	/**
	 * 结果信息
	 */
	private String message="";
	
	public JsonUtil(){
	}
	
	public JsonUtil(boolean success,String message){
		if (message != null){
			this.message=message;
		}
		this.success=success;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * 获取处理结果的Json字符串
	 */
	public String toString(){
		JSONObject object = new JSONObject();
		object.accumulate("success", success);
		object.accumulate("message", message);
		return object.toString();
	}
	
	

}
