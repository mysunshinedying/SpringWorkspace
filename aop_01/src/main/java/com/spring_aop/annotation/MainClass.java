package com.spring_aop.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-config_annot.xml");
		
		
		//핵심기능 클래스 객체 인스턴스(bean)
		Rect rect = context.getBean("rect", Rect.class);
		Gugudan gg = context.getBean("gugudan", Gugudan.class);
		
		rect.showResult();
		gg.showResult();

	}

}
