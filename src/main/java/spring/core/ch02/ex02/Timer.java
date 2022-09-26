package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//join point 결합지점 aspect와 결합 할 클래스의 method
//point cut join point의 기준
@Aspect
@Component
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	
	@Around("myPointcut()")
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");		
		return result;
	}
}
