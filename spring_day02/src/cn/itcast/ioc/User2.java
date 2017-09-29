package cn.itcast.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Repository(value="user")
@Controller(value="user2")
@Scope(value="prototype")
public class User2 {
	
	public void add(){
		System.out.println("User add......");
	}
	
	

}
