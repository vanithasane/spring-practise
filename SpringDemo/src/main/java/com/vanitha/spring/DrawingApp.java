package com.vanitha.spring;

import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {
	
	private static final Logger logger =  Logger.getLogger(DrawingApp.class.getName());

	public static void main(String[] args) {
		BeanFactory factory = null;
		ApplicationContext context = null;
		Triangle triangle = null;
		try{
			// TODO Auto-generated method stub
//	        Triangle triangle=new Triangle();
			
//			BeanFactory obj creation
//			factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
//	        triangle=(Triangle)factory.getBean("triangle");
//			triangle.draw();			

//			ApplicationContext obj creation.
			context=new ClassPathXmlApplicationContext("spring.xml");
			triangle=(Triangle)context.getBean("triangle");
			triangle.draw();			
		} catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
			logger.info("Exception while creating Bean : " + noSuchBeanDefinitionException.getMessage());
			noSuchBeanDefinitionException.printStackTrace();			
		} catch(ClassCastException classCastException) {
			logger.info("Exception while Casting Bean : " + classCastException.getMessage());
			classCastException.printStackTrace();			
		}
		
	}

}
