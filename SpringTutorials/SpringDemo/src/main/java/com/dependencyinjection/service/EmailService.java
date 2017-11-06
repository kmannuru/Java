package com.dependencyinjection.service;

public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String message, String rec) {
		System.out.println("sendingEmail Message : "+message+"to Email "+rec);
		return true;
	}

}
