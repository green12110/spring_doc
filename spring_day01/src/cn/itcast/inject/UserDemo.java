package cn.itcast.inject;

public class UserDemo {
	
	private String username;
	
	public UserDemo(String username){
		this.username = username;
	}
	
	
	public void test(){
		System.out.println("UserDemo:"+this.username);
		
	}
	
	

		

}
