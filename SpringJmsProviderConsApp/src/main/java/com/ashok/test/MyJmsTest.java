package com.ashok.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashok.config.AppConfig;
import com.ashok.listner.MyMessageListner;

public class MyJmsTest {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac =  new AnnotationConfigApplicationContext(AppConfig.class);
		MyMessageListner mt = (MyMessageListner)ac.getBean(MyMessageListner.class);
	}

}
