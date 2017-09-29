package cn.itcast.aspect.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Mybook {
	
	public void before1(){
		System.out.println("前置增强......");
	}
    
	
	public void after1(){
		System.out.println("后置增强......");
	}
	
	//环绕通知
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("环绕增强 前.....");
		proceedingJoinPoint.proceed();
		System.out.println("环绕增强 后......");
		
	}
}
