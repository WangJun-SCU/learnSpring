package com.wangjun.mybatis.test.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyBatisTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatis/springMyBatis.xml");
		UserMapper um = context.getBean("userMapper", UserMapper.class);
		//查询数据
		User user = um.getUser(1);
		System.out.println(user.getName());
		System.out.println(user.getAge());
		
		//插入数据
		User addUser = new User("luyijia", 24);
		um.insertUser(addUser);
	}

}
