package com.alporan.springconfigurations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageProcessorImpl implements MessageProcessor {
	
	private String message;
	private MessageService messageService;
	
	@Autowired
	public MessageProcessorImpl(@Qualifier("emailService") MessageService messageService) {
		this.messageService = messageService;
	}
	
	@Override
	public void processMsg() {
		messageService.sendMessage(this.message);
	}
	
	@Override
	@PostConstruct
	public void initBean() {
		messageService.sendMessage("Initialized");
	}
	
	@Override
	@PreDestroy
	public void destroyBean() {
		messageService.sendMessage("Destroyed");
	}
	
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
}