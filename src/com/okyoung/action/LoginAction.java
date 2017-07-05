package com.okyoung.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.okyoung.entity.Manager;
import com.okyoung.service.ManagerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport implements ModelDriven<Manager>{
	
	@Resource
	ManagerService managerService;
	
	Manager manager = new Manager();

	@Override
	public Manager getModel() {
		return manager;
	}
	
	@Override
	public String execute() throws Exception {
		String username = manager.getUsername();
		String pwd = manager.getPwd();
		boolean result = managerService.validate(username, pwd);
		if (result){
			return SUCCESS;
		}
		return ERROR;
	}


}
