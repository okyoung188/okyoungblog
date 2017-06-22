package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	//静态代码块，加载类的时候执行一次，并只执行一次
	static{
		//获取配置文件并配置,读取主配置文件，完成初始化
    	Configuration config=new Configuration().configure();
    	//设置ServiceRegistry
    	ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建sessionFactory
    	SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
    	//创建session对象
    	session=sessionFactory.openSession();
	}
	//获得session对象
    public static Session getSession(){
    	 	return session;    	   
    }
    //关闭session对象
    public static void closeSession(Session session){
    	if(session!=null)
    	session.close();
    }
    
    //获得sessionFactory对象
    public static SessionFactory getSessionFactory(){
    	return sessionFactory;
    }
}
