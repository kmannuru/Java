package com.dependencyinjection.service;

public class TwitterService implements MessageService{

	@Override
	public boolean sendMessage(String message, String rec) {
		System.out.println("Sending Tweet :"+message + "and "+ rec);
		return true;
	}

}
