package cn.itcast.inject;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add(){
		userDao.add();
	}
	
	


}