package org.ashok.product.test;

import org.ashok.product.config.AppConfiguration;
import org.ashok.product.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Product p = (Product)ac.getBean("productObj");
		System.out.println(p.toString());
	}

}
