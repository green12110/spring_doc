package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.inject.Book;
import cn.itcast.inject.UserDemo;
import cn.itcast.inject.UserService;

public class BeanArrInjectTest {
	
	@Test
	public void injectTest1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Book book = (Book)context.getBean("book");
		
		book.test();
		
		
	}
	
	@Test
	public void injectTest2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		UserDemo user = (UserDemo)context.getBean("userDemo");
		user.test();
		
	}
	
	
	@Test
	public void injectTest3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		UserService userService = (UserService)context.getBean("userService");
		userService.add();
		
	}

}
