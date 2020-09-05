package com.alporan.springconfigurations.services;

public interface MessageProcessor {
	void processMessage();
	
	void initBean();
	
	void destroyBean();
}