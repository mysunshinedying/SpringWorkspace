//package를 class와 동일하게 구성해도 resources 폴더에서는 클래스 인식 불가
//설정과 관련된 class라도 인식 가능하게 java 폴더에서 생성 되어야함
package com.di.spring_di_annotation.configration_bean;

import java.util.ArrayList;

@ComponentScan("com.di.spring_di_annotation.configration_bean")
@Configuration //구성파일 설정 @
public class ApplicationConfig {
	@Bean
	public BMI bmi() {
		BMI bmi = new BMI();
		return bmi;
	}
	
	@Bean
	public Member member() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("수영");
		courses.add("헬스");
		courses.add("에어로빅");
		Member member = new Member();
		member.setBmi(bmi());
		member.setName("홍길동");
		member.setAge(23);
		member.setHeight(175);
		member.setWeight(70);
		member.setCourses(courses);
		
		return member;
	}
}
