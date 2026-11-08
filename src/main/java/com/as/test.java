package com.as;



import com.aniket.config;
import com.aniket.mains.call;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(config.class);
		
		call bean = context.getBean(call.class);
		System.out.println(bean.callingallMethod());
	
	}
}
