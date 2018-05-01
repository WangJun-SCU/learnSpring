package com.wangjun.mybatis.test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMapper {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		System.out.println(111);
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}
	
	public void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("wangjun", new Integer(25));
			userMapper.insertUser(user);
			sqlSession.commit();
		}finally {
			sqlSession.close();
		}
	}
	public void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser(1);
			System.out.println("name:" + user.getName() + "|age:" + user.getAge());
		}finally {
			sqlSession.close();
		}
	}
	
	public static void main(String[] args) {
		TestMapper tm = new TestMapper();
		tm.testAdd();
		tm.getUser();
	}
}