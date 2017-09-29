package cn.itcast.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.inject2.Department;
import cn.itcast.inject2.Employee;
import cn.itcast.inject2.Person;

public class BeanArrInjectTest2 {
	
	@Test
	public void injectTest1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		Person person = (Person)context.getBean("person");
		
		person.test();
		
		
	}
	
	@Test
	public void injectTest2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		Department department = (Department)context.getBean("department");
		System.out.println(department);
	
		System.out.println(	department.getName());
		System.out.println("============================");
		String[] arr = department.getEmpName();
		for(String name : arr){
			System.out.println(name);
		}
		System.out.println("============================");
		List<Employee> employeeList = department.getEmpList();
		for(Employee ee : employeeList){
			System.out.println(ee.toString());
		}
		System.out.println("============================");
		Set<Employee> employeeSet = department.getEmpsets();
		for(Employee ee : employeeSet){
			System.out.println(ee.toString());
		}
		
		System.out.println("===============================");
		Map<String,Employee> employeeMap = department.getEmpMaps();
		Set<Entry<String,Employee>> emloyeeEntry = employeeMap.entrySet();
		for(Entry<String,Employee> entry: emloyeeEntry){
			System.out.println(entry.getKey()+"====="+entry.getValue());
		}
	
	
	}
	
}
