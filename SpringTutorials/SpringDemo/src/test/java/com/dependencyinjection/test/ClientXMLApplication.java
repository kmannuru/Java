package com.dependencyinjection.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjection.configuration.DIConfiguration;
import com.dependencyinjection.consumer.MyApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String message = "Hello Google";
			String rec = "mrkr1162@gmail.com";
			ClassPathApplicationContext context = new ClassPathXMLApplicationContext("applicationContext.xml");
			
			MyApplication app = (MyApplication) context.getBean("myXMLApp");
			app.processMessage(message, rec);
			
			context.close();
			
	}

}
