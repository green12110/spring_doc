package cn.itcast.inject;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	
	//@Autowired
	@Resource(name="userDao")  //name值写注解方式创建dao的对象，类似name ,ref
	private UserDao userDao;
	
	public void add(){
		userDao.add();
	}

}
