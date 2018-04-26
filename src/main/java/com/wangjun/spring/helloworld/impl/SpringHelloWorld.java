package com.wangjun.spring.helloworld.impl;

import com.wangjun.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld{
	
	@Override
	public void sayHello() {
		System.out.println("Spring say hello world!");
	}

}
