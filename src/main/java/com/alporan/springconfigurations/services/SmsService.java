package com.alporan.springconfigurations.services;

public class SmsService implements MessageService {
	
	@Override
	public void sendMessage(String message){
		System.out.println("Message send by SMS: " + message);
	}
}