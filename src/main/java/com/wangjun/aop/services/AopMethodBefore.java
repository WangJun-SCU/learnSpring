package com.wangjun.aop.services;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

/*
 * 新建一个在方法执行前的切面，他会在方法执行前执行
 */

public class AopMethodBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("AopMethodBefore start...");
		System.out.println("method:" + arg0);
		System.out.println("Object[]:" + Arrays.toString(arg1));
		System.out.println("Obejct:" + arg2.toString());
	}

}
