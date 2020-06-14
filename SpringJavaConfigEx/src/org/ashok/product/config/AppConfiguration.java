package org.ashok.product.config;

import org.ashok.product.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean
	public Product productObj()
	{
		Product pro = new Product();
		pro.setProductId(1);
		pro.setProductName("LG");
		pro.setProductPrice(1123.0);
		return pro;

	}
}
