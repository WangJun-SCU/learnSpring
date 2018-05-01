package com.wangjun.aop.aspectJ;

public class TestBean {
	private String testStr = "testStr";
	public String getTestStr() {
		return testStr;
	}
	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	public String test() {
		System.out.println("test");
		return "result";
	}
}
