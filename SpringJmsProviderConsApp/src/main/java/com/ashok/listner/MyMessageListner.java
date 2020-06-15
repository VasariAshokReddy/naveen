package com.ashok.listner;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class MyMessageListner implements MessageListener {

	public void onMessage(Message message) {
		TextMessage tm=(TextMessage) message;   
		try
		{ 
			System.out.println(tm.getText()); 
		} 
		catch (JMSException e)
		{  
			e.printStackTrace();  
		} 
	}

}
