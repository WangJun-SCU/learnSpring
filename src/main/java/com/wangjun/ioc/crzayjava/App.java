package com.wangjun.ioc.crzayjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoCCrazyjava.xml");
		//设值注入
		Chinese chinese = context.getBean("chinese", Chinese.class);
		chinese.useAxe();
		//构造注入
		American american = context.getBean("american", American.class);
		american.useAxe();
	}

}
