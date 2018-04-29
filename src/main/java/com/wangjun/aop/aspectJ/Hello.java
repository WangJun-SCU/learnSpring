package com.wangjun.aop.aspectJ;

public class Hello {
	public void foo() {
		System.out.println("执行了Hello类的foo方法");
	}
	
	public int addUser(String name, String pass) {
		System.out.println("执行Hello类的addUser方法，添加用户：" + name);
		return 20;
	}
	
	
}
