package com.mycompany.myapp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RuntimeCheckAspect {
	private static final Logger LOGGER=LoggerFactory.getLogger(RuntimeCheckAspect.class);
	//PointCut
	@Pointcut("execution(public * com.mycompany.myapp.controller.Exam12DBController.*(..))") 
	private void runtimeCheckMethod(){} //역할이 없지만 나중에 메소드를 식별이름으로 쓰기 위해서 
	
	//Advice
	@Around("runtimeCheckMethod()")  //메소드 이름 넣어줌 
	public Object runtimeCheckAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		//before code
		long startTime=System.nanoTime();
		
		Object result=joinPoint.proceed(); //실제 호출해야할 메소드를 호출 
		
		//after code
		long endTime=System.nanoTime();
		
		long time=endTime-startTime;
		String realMethod=joinPoint.getSignature().toShortString();
		LOGGER.info(realMethod+" 실행 시간 : " +time+" ns");
		return result;
	}
}
