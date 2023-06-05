package com.wangjun.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopXml.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.foo("fooInput");


//		World world = context.getBean("world", World.class);
//		world.bar();


	}

}
