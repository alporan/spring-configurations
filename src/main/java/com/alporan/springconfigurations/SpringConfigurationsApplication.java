package com.alporan.springconfigurations;

import com.alporan.springconfigurations.services.MessageProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class SpringConfigurationsApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringConfigurationsApplication.class, args);
		MessageProcessor messageProcessor = applicationContext.getBean(MessageProcessor.class);
		messageProcessor.processMessage();
	}
}
