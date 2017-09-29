package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.inject.UserService;
import cn.itcast.mix.BookService;

public class InjectTest {
	
	@Test
	public void autowiredTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		UserService userService = (UserService)context.getBean("userService");
		userService.add();
		
	}
	
	
	@Test
	public void testMix(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		BookService bookService = (BookService)context.getBean("bookService");
		bookService.add();
		
		
	}

}
