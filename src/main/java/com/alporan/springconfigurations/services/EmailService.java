package com.alporan.springconfigurations.services;

public class EmailService implements MessageService {
	
	@Override
	public void sendMessage(String message){
		System.out.println("Message send by e-mail: " + message);
	}
}
