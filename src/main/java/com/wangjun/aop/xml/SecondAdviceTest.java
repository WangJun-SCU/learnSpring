package com.wangjun.aop.xml;

public class SecondAdviceTest {
	//定义before增强处理
	public void authority(String aa) {
		System.out.println("[before] SecondAdviceTest.authority,目标方法的参数：" + aa);
	}
}
