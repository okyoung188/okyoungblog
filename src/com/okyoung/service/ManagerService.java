package com.okyoung.service;

import com.okyoung.entity.Manager;

public interface ManagerService extends BaseService<Manager>{

	/**
	 * 登录验证
	 * @param username
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	public boolean validate(String username,String pwd) throws Exception;
	
}
