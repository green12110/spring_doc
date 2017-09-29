package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Bean3;

public class Bean3FactroyTest {
	
	@Test
	public void bean3Factory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Bean3 bean = (Bean3)context.getBean("bean3");
		System.out.println(bean);
		bean.add();
		
	}

}
