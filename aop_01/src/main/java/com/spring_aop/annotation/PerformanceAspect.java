package com.spring_aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//공통기능 메서드 포함
@Aspect
public class PerformanceAspect {
	//where : @Pointcut("expression")
	@Pointcut("within(com.spring_aop.annotation.*)")
	private void pointCutMethod() {
		
	}
	
	//when:advice 시점(point-cut ref가 필요)
	@Around("pointCutMethod()")
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
