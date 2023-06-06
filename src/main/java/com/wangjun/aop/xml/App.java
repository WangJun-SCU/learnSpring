package com.wangjun.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopXml.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.foo("fooInput");
	}

}
