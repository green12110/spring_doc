package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ioc.User;

public class BeanScopeTest {
	
	@Test
	public void scopeTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user1 = (User)context.getBean("user");
		User user2 = (User)context.getBean("user");
		
		System.out.println(user1);
		System.out.println(user2);
	}

}
