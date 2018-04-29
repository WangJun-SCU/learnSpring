package com.wangjun.aop.xml;

public class SecondAdviceTest {
	//定义before增强处理
	public void authority(String aa) {
		System.out.println("目标方法的参数：" + aa);
		System.out.println("Another Before方法增强，模拟进行权限检查");
	}
}
