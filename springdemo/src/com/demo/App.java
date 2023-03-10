package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	// private static final String getName = null;

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Student c = ctx.getBean("sc", Student.class);
		System.out.println(c);
//		System.out.println(c.jersey);
//		System.out.println(c.name);
//		c.eat();
//		c.exerscise();
		ctx.close();

//			Player c = ctx.getBean("pl", Player.class);
//			c.eat();
//			c.exerscise();
//
//			Footballer f = ctx.getBean("fr", Footballer.class);
//			f.eat();
//			f.exerscise();
//
//			Tennisplayer p = ctx.getBean("tp", Tennisplayer.class);
//			p.eat();
//			p.exerscise();

	}
}
