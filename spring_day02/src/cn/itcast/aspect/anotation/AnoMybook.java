package cn.itcast.aspect.anotation;

import org.aspectj.lang.ProceedingJoinPoint;

public class AnoMybook {
	
	public void before1(){
		System.out.println("ǰ����ǿ......");
	}
    
	
	public void after1(){
		System.out.println("������ǿ......");
	}
	
	//����֪ͨ
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("������ǿ ǰ.....");
		proceedingJoinPoint.proceed();
		System.out.println("������ǿ ��......");
		
	}
}
