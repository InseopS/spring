package spring.core.ch01.ex04;

import org.springframework.context.annotation.Bean;

import spring.core.ch01.ex01.Pistol;

public class Config1 {
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
}
