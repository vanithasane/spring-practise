package com.vanitha.spring;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class Triangle {
	//public class Triangle implements ApplicationContextAware,BeanNameAware{	
		private static final Logger logger=null;
	/*private String type;
	private int height;
//	constructtor injection
	public Triangle(String Triangle){
		this.type=type;
	}
	public Triangle(String type,int height){
		this.type=type;
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public String getType() {
		return type;
	}
	public Triangle(int height){
		this.height=height;
	}
	

//	public void setType(String type) {
//		this.type = type;
//	*/
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context=null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw()
	{
		System.out.println("pointA("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("pointB("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("pointA("+getPointC().getX()+","+getPointC().getY()+")");
	}

/*	public void setBeanName(String beanName) {
	logger.info("BeanNAme"+beanName);
		
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
		logger.info("context"+context);
		
	}*/
	
	/*private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw(){
		for(Point point:points)
			System.out.println("points("+point.getX()+","+point.getY()+")");
	}*/

}
