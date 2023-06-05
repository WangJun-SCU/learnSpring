package com.wangjun.aop.xml;

public class Hello {
	public int foo(String str) {
		System.out.println("[执行]Hello.foo, str:" + str);
		return 10;
	}
	
	public int addUser(String name, String pass) {
		System.out.println("[执行]Hello.addUser, 添加用户:" + name);
		return 20;
	}
	
	
}
