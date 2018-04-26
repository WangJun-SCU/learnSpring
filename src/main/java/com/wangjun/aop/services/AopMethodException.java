package com.wangjun.aop.services;

import org.springframework.aop.ThrowsAdvice;

public class AopMethodException implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("AopMethodException start...");
	}
	
}
