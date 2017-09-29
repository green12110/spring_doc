package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Bean2;
import cn.itcast.ioc.User;

public class Bean2FactroyTest {
	
	@Test
	public void bean2Test(){
		
	     ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	     Bean2 bean = (Bean2)context.getBean("bean2");
	     System.out.println(bean);
	     bean.add();
		
	}

}
