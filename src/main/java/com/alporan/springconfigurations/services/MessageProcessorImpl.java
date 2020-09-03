package com.alporan.springconfigurations.services;

public class MessageProcessorImpl implements MessageProcessor {
	
	private String message;
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
	
	public void setMessage(String message) {
		this.message = message;
	}
}