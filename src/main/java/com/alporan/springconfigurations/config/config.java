package com.alporan.springconfigurations.config;

import com.alporan.springconfigurations.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class config {
	
	@Bean
	public EmailService emailService(){
		return new EmailService();
	}
	
	@Bean
	public SmsService smsService(){
		return new SmsService();
	}
	
	@Bean(initMethod = "initBean", destroyMethod = "destroyBean")
	@Scope("singleton")
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(emailService());
	}
}
