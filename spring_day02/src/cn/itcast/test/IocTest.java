package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ioc.User;
import cn.itcast.ioc.User2;

public class IocTest {
	
	@Test
	public void testUser(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		user.add();
		
	}
	
	@Test
	public void testScope(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User2 user1 = (User2)context.getBean("user2");
		User2 user2 = (User2)context.getBean("user2");
		System.out.println(user1);
		System.out.println(user2);

		
	}

}
