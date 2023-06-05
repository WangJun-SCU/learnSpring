package com.wangjun.aop.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @description 
 * @author wangjun100
 * @date 2023/6/5
 */
public class ThirdAdviceTest implements MethodInterceptor  {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        // 完整的类名
        String serviceName = invocation.getThis().getClass().getSimpleName();
        // 方法名
        String methodName = invocation.getMethod().getName();

        System.out.println("[执行]ThirdAdviceTest.invoke 目标类名.方法名:" + serviceName + "." + methodName);

        return invocation.proceed();
    }
}
