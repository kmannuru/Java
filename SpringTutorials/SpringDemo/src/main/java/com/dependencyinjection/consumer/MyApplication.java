package com.dependencyinjection.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dependencyinjection.service.MessageService;

@Component
public class MyApplication {
	
	private MessageService service;
	
	@Autowired
	public void setService (MessageService service) {
		this.service = service;
	}
	
	public void processMessage(String message, String rec) {
		this.service.sendMessage(message, rec);
	}
	
}
