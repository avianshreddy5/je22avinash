package com.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Laptop l = ctx.getBean("l", Laptop.class);
		System.out.println(l);
		ctx.close();
	}

}
