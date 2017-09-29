package cn.itcast.inject;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	
	//@Autowired
	@Resource(name="userDao")  //nameֵдע�ⷽʽ����dao�Ķ�������name ,ref
	private UserDao userDao;
	
	public void add(){
		userDao.add();
	}

}
