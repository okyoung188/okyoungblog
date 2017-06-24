package com.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.okyoung.action.BlogListAction;
import com.okyoung.pagemodel.ArticleModel;
import com.okyoung.service.ArticleService;
import com.okyoung.service.impl.ArticleServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class BeanTest {
	
	@Resource
	ApplicationContext context;
	
	@Test
	public void initBean() throws Exception{
		ArticleService service = (ArticleService) context.getBean("articleService");
		List<ArticleModel> articles = service.listByCtg("感悟", 1, 10);
		for (ArticleModel model : articles){
			System.out.println(model);
		}
	}
	
	
	
	@Test
	public void testAction() throws Exception{
		BlogListAction action = (BlogListAction) context.getBean("blogListAction");
		action.execute();
	}
	

}
