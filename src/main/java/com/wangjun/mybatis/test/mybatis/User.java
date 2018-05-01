package com.wangjun.mybatis.test.mybatis;

public class User {
	private Integer id;
	private String name;
	private Integer age;

	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 必须要有这个无参构造器，不然根据UserMapper.xml中的配置，在查询数据库的时候，将不能呢过反射构造出User实例
	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}