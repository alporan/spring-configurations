package com.alporan.springconfigurations.services;

import org.springframework.beans.factory.annotation.Value;

public class MessageProcessorImpl implements MessageProcessor {
	
	@Value("${input.message}")private String message;
	private MessageService messageService;
	
	public MessageProcessorImpl(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@Override
	public void processMsg() {
		messageService.sendMessage(this.message);
	}
	
	@Override
	public void initBean() {
		messageService.sendMessage("Initialized");
	}
	
	@Override
	public void destroyBean() {
		messageService.sendMessage("Destroyed");
	}
}