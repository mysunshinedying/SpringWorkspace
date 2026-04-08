package com.di.spring_di_xml_setter_ex_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("application-context2_1.xml");
		
		TV tv = context.getBean("TV", TV.class);
		
		tv.volumeUp();
		tv.volumeDown();

	}

}
