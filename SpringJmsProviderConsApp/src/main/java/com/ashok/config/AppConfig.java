package com.ashok.config;

import javax.jms.ConnectionFactory;
import javax.jms.MessageListener;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

@Configuration
@EnableJms
@ComponentScan(basePackages="com.ashok")
public class AppConfig {

	@Autowired
	private MessageListener listner;

	@Bean
	public ConnectionFactory connFact()
	{
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
		cf.setBrokerURL("tcp://localhost:61616");
		return cf;
	}

	@Bean
	public MessageListenerContainer listnerContainer()
	{
		DefaultMessageListenerContainer lc = new DefaultMessageListenerContainer();
		lc.setConnectionFactory(connFact());
		lc.setDestinationName("AshokReddy");
		lc.setMessageListener(listner);
		return lc;
	}
}
