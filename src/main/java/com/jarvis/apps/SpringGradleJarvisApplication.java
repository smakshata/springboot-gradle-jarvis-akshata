package com.jarvis.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.jarvis.apps.*" })
@SpringBootApplication
@EnableAutoConfiguration
public class SpringGradleJarvisApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringGradleJarvisApplication.class);
	}

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringGradleJarvisApplication.class, args);
	}
}
