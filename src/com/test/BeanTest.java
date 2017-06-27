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
import com.okyoung.pagemodel.Menu;
import com.okyoung.pagemodel.PageBean;
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
		PageBean<ArticleModel> pageBean = service.listByCtg("感悟", 1, 10);
//		List<ArticleModel> articles = pageBean.getModelList();
//		for (ArticleModel model : articles){
//			System.out.println(model);
//		}
		Menu menu = pageBean.getMenu();
		List<Menu> subMenus = menu.getSubMenu();
		for (Menu subMenu:subMenus){
			System.out.println(subMenu);
			List<Menu> subs = subMenu.getSubMenu();
			for(Menu m: subs){
				System.out.println(m);
			}
		}
	}
	
	@Test
	public void testCount()throws Exception{
		ArticleService service = (ArticleService) context.getBean("articleService");
		long a = service.countByType("html5");
		System.out.println(a);
	}
	
	
	@Test
	public void testAction() throws Exception{
		BlogListAction action = (BlogListAction) context.getBean("blogListAction");
		action.execute();
	}
	

}
