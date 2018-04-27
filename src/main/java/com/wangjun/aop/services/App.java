package com.wangjun.aop.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//使用IOC依赖注入获取类的实例
		ApplicationContext context = new ClassPathXmlApplicationContext("customerBean.xml");
		/*
		CustomerService service = (CustomerService) context.getBean("customerService");
		service.printName();
		service.printUrl();
		try {
			service.throwException();
		} catch (Exception e) {
			System.out.println("抛出异常！");
		}
		*/
		//使用AOP拦截，新建新的bean
		//通知Advices是对所有方法进行拦截
		/*
		CustomerService service2 = (CustomerService) context.getBean("customerServiceProxy");
		System.out.println("使用AOP对method进行拦截...");
		service2.printName();
		service2.printUrl();
		try {
			service2.throwException();
		} catch (Exception e) {
			System.out.println("抛出异常2！");
		}
		*/
		
		//如何对指定的方法进行拦截
		CustomerService service3 = context.getBean("customerServiceProxy2",CustomerService.class);
		System.out.println("使用AOP对指定method进行拦截...");
		service3.printName();
		service3.printUrl();
		try {
			service3.throwException();
		} catch (Exception e) {
			System.out.println("抛出异常2！");
		}
	}

}
