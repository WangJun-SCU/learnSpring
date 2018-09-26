package com.wangjun.ioc.crzayjava;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * 实现接口BeanPostProcessor，会处理IOC容器所有的Bean
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getSimpleName()+ ":" + beanName + "开始实例化");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getSimpleName()+ ":" + beanName + "实例化完成");
		return bean;
	}

}
