package com.spring_aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

//공통기능 메서드 포함
public class PerformanceAspect {
	//각 핵심기능의 시작시간 종료시간을 로그 기록
	//핵심기능 수행 전/후에 시간 출력
	// 공통기능 수행 메서드 : trace()
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{ //JoinPoint : 핵심기능 메서드 호출시점
		Signature s = joinPoint.getSignature();
		String methodName = s.getName(); //핵심기능 메서드 이름
		
		System.out.println("------------------------");
		System.out.println("[Log]Before:" + methodName + "() :실행 시작");
		System.out.println("------------------------");
		
		long startTime = System.nanoTime();
		
		Object result = null;
		try {
			result = joinPoint.proceed(); //핵심 기능 수행
		} catch(Exception e) {
			System.out.println("[Log]Exception:" + methodName);
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("------------------------");
		System.out.println("[Log]After:" + methodName + "() :실행 종료");
		System.out.println("[Log] : " + methodName + "() 실행 시간: " + (endTime - startTime) + "ns");
		System.out.println("------------------------");
		
		return result;
	}
}
