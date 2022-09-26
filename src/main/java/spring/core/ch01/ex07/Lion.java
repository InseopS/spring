package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lion is born.");
	}
	
	public void shout() {
		System.out.println("List shout.");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Lion is dead.");
	}
}
