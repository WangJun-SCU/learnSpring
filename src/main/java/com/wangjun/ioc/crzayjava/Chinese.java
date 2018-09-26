package com.wangjun.ioc.crzayjava;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * 实现一些接口，测试bean的生命周期
 * 这个类实现了所有生命周期所能实现的方法
 * 也自定义了初始化方法init和销毁方法myDestroy，需要在xml中配置
 */
public class Chinese implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	private Axe axe;
	
	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		//person对象依赖Axe对象
		System.out.println("Chinese" + axe.chop());
	}
	
	public void init() {
		System.out.println(this.getClass().getSimpleName() + "--执行自定义初始化方法。");
	}
	public void myDestroy() {
		System.out.println(this.getClass().getSimpleName() + "--执行自定义销毁方法。");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this.getClass().getSimpleName() + "--调用destroy方法。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getSimpleName() + "--调用afterPropertiesSet方法。");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + "--调用setApplicationContext方法。");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + "--调用setBeanFactory方法。");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(this.getClass().getSimpleName() + "--调用setBeanName方法。入参：" + name);
	}

}
