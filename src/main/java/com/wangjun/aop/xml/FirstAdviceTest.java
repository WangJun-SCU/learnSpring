package com.wangjun.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class FirstAdviceTest {

	public void before(JoinPoint jp) {
		System.out.println("[before] start...");
		String targetMethod = jp.getSignature().getName();//目标方法
		Object[] args = jp.getArgs();//目标方法的入参
		Object target = jp.getTarget();//目标对象
		System.out.println(String.format("目标对象:%s,目标方法:%s,目标入参:%s", target, targetMethod, Arrays.toString(args)));
		System.out.println("[before] end..");
	}

	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("[around]  start...");
		Object[] args = jp.getArgs();
		if(args != null && args.length > 0 && args[0].getClass() == String.class) {
			//修改目标方法的第一个参数
			args[0] += "【增加的后缀】";
		}
		//执行目标方法，并保存目标方法执行后的返回值
		Object rvt = jp.proceed(args);
		System.out.println("[around] 执行方法后...");
		//如果rvt的类型是Integer，则将rvt改为它的平方
		if(null != rvt && rvt instanceof Integer) {
			rvt = (Integer)rvt * (Integer)rvt;
		}
		return rvt;
	}
	
	public void afterReturning(JoinPoint jp, Object rvt) {
		System.out.println("[afterReturning] 获取方法的返回值:" + rvt);
	}
}
