package com.wangjun.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class FourAdviceTest {
	public Object processTask(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("around增强：执行目标方法之前，模拟事务开始...");
		Object[] args = jp.getArgs();
		if(args != null && args.length > 0 && args[0].getClass() == String.class) {
			//修改目标方法的第一个参数
			args[0] += "【增加的后缀】";
		}
		//执行目标方法，并保存目标方法执行后的返回值
		Object rvt = jp.proceed(args);
		System.out.println("around增强：执行方法后，模拟事务结束...");
		//如果rvt的类型是Integer，则将rvt改为它的平方
		if(null != rvt && rvt instanceof Integer) {
			rvt = (Integer)rvt * (Integer)rvt;
		}
		return rvt;
	}
	
	public void authority(JoinPoint jp) {
		System.out.println("before方法增强，模拟方法执行前进行权限检查开始...");
		String targetMethod = jp.getSignature().getName();//目标方法
		Object[] args = jp.getArgs();//目标方法的入参
		Object target = jp.getTarget();//目标对象
		System.out.println(targetMethod);
		System.out.println(Arrays.toString(args));
		System.out.println(target);
		System.out.println("before方法增强，模拟方法执行前进行权限检查结束...");
	}
	
	public void log(JoinPoint jp, Object rvt) {
		System.out.println("afterReturning方法增强，获取方法的返回值：" + rvt);
		System.out.println("模拟记录日志...");
		String targetMethod = jp.getSignature().getName();//目标方法
		Object[] args = jp.getArgs();//目标方法的入参
		Object target = jp.getTarget();//目标对象
		System.out.println(targetMethod);
		System.out.println(Arrays.toString(args));
		System.out.println(target);
		System.out.println("模拟记录日志结束...");
	}
}
