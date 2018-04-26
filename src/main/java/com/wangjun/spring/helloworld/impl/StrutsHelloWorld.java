package com.wangjun.spring.helloworld.impl;

import com.wangjun.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld{
	@Override
	public void sayHello() {
		System.out.println("Struts say hello world!");
	}
}
