package spring.core.ch01.ex04;

import org.springframework.context.annotation.Bean;

import spring.core.ch01.ex01.Rifle;

public class Config2 {
	@Bean
	public Rifle rifle() {
		return  new Rifle();
	}
}
