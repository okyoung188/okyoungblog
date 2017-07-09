package com.okyoung.action;

import javax.annotation.Resource;

import org.junit.internal.runners.statements.Fail;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.okyoung.pagemodel.CritiqueModel;
import com.okyoung.service.CritiqueService;
import com.okyoung.util.Message;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class CritiqueAction implements ModelDriven<CritiqueModel>{
	@Resource
	CritiqueService critiqueService;
	
	CritiqueModel critiqueModel = new CritiqueModel();
	
	Message message;

	@Override
	public CritiqueModel getModel() {
		return critiqueModel;
	}

	public CritiqueModel getCritiqueModel() {
		return critiqueModel;
	}

	public void setCritiqueModel(CritiqueModel critiqueModel) {
		this.critiqueModel = critiqueModel;
	}
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String add() throws Exception{
		message = new Message();
		if(critiqueModel.getArticleId() <=0){
			message.setMessage("ArticleId 不合法！请检查！");
			return "success";
		}
		if(critiqueModel.getContent() == null){
	    	message.setMessage("评论不能为空！");
	    	return "success";
	    }
		if(critiqueModel.getEmail() == null){
			message.setMessage("邮箱不能为空！");
	    	return "success";
		}
		if(critiqueModel.getNickname() == null){
			message.setMessage("昵称不能为空！");
			return "success";
		}
	
	    critiqueService.add(critiqueModel);
	    message.setSuccess(true);
	    message.setMessage("添加评论成功！");
	  
	    return "success";
	}
	
	
	
	
	
	
	
	
	

}
