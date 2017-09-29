package cn.itcast.ioc;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//@Repository(value="user")
@Controller(value="user")
public class User {
	
	public void add(){
		System.out.println("User add......");
	}
	
	

}
