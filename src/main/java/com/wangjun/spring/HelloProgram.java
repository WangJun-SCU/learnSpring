package com.wangjun.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wangjun.spring.helloworld.HelloWorld;
import com.wangjun.spring.helloworld.HelloWorldService;

public class HelloProgram {
	public static void main(String[] args) {
		//通过读取bean文件读取应用程序上下文对象
		//IoC容器，其作用是作为第三种角色，创建bean文件中声明的java bean对象，并通过setter方法进行注入依赖
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		HelloWorld hw = service.getHelloWorld();
        hw.sayHello();
	}
}
