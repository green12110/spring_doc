package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.aspect.xml.Book;

public class AopTest {
	
	@Test
	public void xmlAopTest(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		Book book = (Book)context.getBean("book");
		book.add();
		
	}

}
