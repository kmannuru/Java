package com.dependencyinjection.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjection.configuration.DIConfiguration;
import com.dependencyinjection.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String message = "Hello Google";
			String rec = "mrkr1162@gmail.com";
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
			
			MyApplication app = (MyApplication) context.getBean(MyApplication.class);
			app.processMessage(message, rec);
			
			context.close();
			
	}

}
