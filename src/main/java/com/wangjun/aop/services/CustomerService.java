package com.wangjun.aop.services;

/*
 * 创建一个简单的客户服务类以及print方法作为演示
 */
public class CustomerService {
	
	private String name;
	private String url;
	public void printName() {
		System.out.println("name:" + this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void printUrl() {
		System.out.println("url:" + this.url);
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void throwException() {
		throw new IllegalArgumentException();
	}

}
