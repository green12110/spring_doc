package cn.itcast.inject2;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private String[] arrs;
	
	private List<String> list;
	
	private Map<String,String> map;
	
	private Properties properties;

	public String[] getArrs() {
		return arrs;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	

	public void setList(List<String> list) {
		this.list = list;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void test(){
		System.out.println("arr:"+this.arrs);
		System.out.println("list:"+this.list);
		System.out.println("map:"+this.map);
		System.out.println("properties:"+this.properties);
	}
	
	
}
