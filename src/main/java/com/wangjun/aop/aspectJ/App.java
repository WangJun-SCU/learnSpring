package com.wangjun.aop.aspectJ;

public class App {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.foo();
		hello.addUser("wangjun", "pass");
		World world = new World();
		world.bar();
	}
}
