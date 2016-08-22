package com.juzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class SpringDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboApplication.class, args);
	}
}
