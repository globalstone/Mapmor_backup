package com.mapmory.common.aspectj;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspectJ {

	@Around("execution(* com.mapmory.services..*.*(..) )")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
			
		System.out.println("");
		System.out.println("[Around before] target object's method :: "+ joinPoint.getTarget().getClass().getSimpleName() +"."+ joinPoint.getSignature().getName());
		if(joinPoint.getArgs().length !=0){
			System.out.println("[Around before] method에 전달되는 argument 개수 = " + joinPoint.getArgs().length);
			System.out.println("[Around before] method에 전달되는 argument :: " + Arrays.asList(joinPoint.getArgs()) ); 
		}

		System.out.println(getClass().getSimpleName() +" :: target  object's  method proceed... ");
		Object obj = joinPoint.proceed();

		System.out.println("[Around after] '"+joinPoint.getTarget().getClass().getSimpleName() +"."+joinPoint.getSignature().getName()+"' return value = "+obj);
		System.out.println("");
		
		return obj;
	}
}
