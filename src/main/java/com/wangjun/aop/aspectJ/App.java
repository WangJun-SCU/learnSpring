package com.wangjun.aop.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopAspectJ.xml");
		TestBean at = context.getBean("test", TestBean.class);
		at.test();
	}

}
