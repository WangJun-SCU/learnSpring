package com.wangjun.aop.xml;

public class Hello {
	public int foo(String str) {
		System.out.println("执行了Hello类的foo方法" + str);
		return 10;
	}
	
	public int addUser(String name, String pass) {
		System.out.println("执行Hello类的addUser方法，添加用户：" + name);
		return 20;
	}
	
	
}
