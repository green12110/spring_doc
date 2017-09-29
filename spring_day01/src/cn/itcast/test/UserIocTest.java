package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ioc.User;

public class UserIocTest {
	
	@Test
	public void testIoc(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User)context.getBean("user");
		
		System.out.println(user);
		user.add();
	}

}
