package com.dependencyinjection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dependencyinjection.service.EmailService;
import com.dependencyinjection.service.MessageService;
import com.dependencyinjection.service.TwitterService;

@Configuration
@ComponentScan (value= {"com.dependencyinjection.consumer"})
public class DIConfiguration {
	
	@Bean
	public MessageService getMessageService() {
		return new TwitterService();
	}
}
