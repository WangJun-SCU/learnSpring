package com.wangjun.aop.xml;

import java.util.Map;

public class Hello {
	public int foo(String str) {
		System.out.println(String.format("[执行]Hello.foo, str:%s", str));
		return 10;
	}

	public void foo(String str, int i, Map<String, String> map) {
		System.out.println(String.format("[执行]Hello.foo, str:%s, i:%d", str, i));
	}

	
	public int addUser(String name, String pass) {
		System.out.println("[执行]Hello.addUser, 添加用户:" + name);
		return 20;
	}
	
	
}
