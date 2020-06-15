package org.ashok.app;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SendMessageTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		JmsTemplate jt = (JmsTemplate)ac.getBean(JmsTemplate.class);
		jt.send("AshokReddy", new MessageCreator() {
			
			public Message createMessage(Session ses) throws JMSException {
				
				return ses.createTextMessage("SpringJmsExample");
			}
		});
		
	}

}
