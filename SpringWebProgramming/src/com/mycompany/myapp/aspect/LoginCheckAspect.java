package com.mycompany.myapp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Component
@Aspect
public class LoginCheckAspect {
	//PointCut
	@Pointcut("execution(public * com.mycompany.myapp.controller.Exam14AopController.Exam02*(..))") 
	private void exam02Method(){} //역할이 없지만 나중에 메소드를 식별이름으로 쓰기 위해서 
	
	
	//Advice
	@Around("exam02Method()") // 메소드 이름 넣어줌
	public Object runtimeCheckAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		// before code
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		String mid = (String) requestAttributes.getAttribute("mid", RequestAttributes.SCOPE_SESSION);
		if (mid == null) {
			requestAttributes.setAttribute("loginNeed","로그인이 필요합니다", RequestAttributes.SCOPE_REQUEST);
			return "aop/exam02LoginForm";
		} else {
			Object result = joinPoint.proceed(); // 실제 호출해야할 메소드를 호출
			// after code
			return result;
		}
	}
}
