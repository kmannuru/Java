package com.dependencyinjection.consumer;

import com.dependencyinjection.service.MessageService;

public class MyXMLApplication {
	
	private MessageService service;
	
	public void setService(MessageService service) {
		this.service = service;
	}
	
	public void processMessage(String message, String rec) {
		this.service.sendMessage(message, rec);
	}
}
