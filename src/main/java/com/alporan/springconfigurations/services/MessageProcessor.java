package com.alporan.springconfigurations.services;

public interface MessageProcessor {
	void processMsg();
	
	void initBean();
	
	void destroyBean();
}