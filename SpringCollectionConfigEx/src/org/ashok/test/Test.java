package org.ashok.test;

import org.ashok.config.AppConfig;
import org.ashok.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Product p = (Product)ac.getBean("prodObj");
		System.out.println(p.toString());


	}

}
