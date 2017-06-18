package com.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class AppConfig {
   public static String FILE_BASEPATH;   
   public static String IMG_BASEPATH;
   public static String IMG_CONTEXTPATH;
   public static final String file_bspath_str = "FILE_BASEPATH";
   public static final String img_bspath_str = "IMG_BASEPATH";
   public static final String img_contextpath_str = "IMG_CONTEXTPATH";
   
   static {
	   InputStream inStream = AppConfig.class.getClassLoader().getResourceAsStream("com/config/AppConfig.properties");
	   Properties props = new Properties();
	   try {
		props.load(inStream);
		FILE_BASEPATH =(String) props.get(file_bspath_str);
		IMG_BASEPATH=(String) props.getProperty(img_bspath_str);
		IMG_CONTEXTPATH = props.getProperty(img_contextpath_str);
	   } catch (IOException e) {
		e.printStackTrace();
	   } 	   
   }
}
