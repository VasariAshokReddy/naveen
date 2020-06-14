package org.ashok.conifg;

import org.ashok.model.Model;
import org.ashok.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Model model()
	{
		Model m = new Model();
		m.setMid(1);
		return m;
	}
	
	@Bean
	public Product proObj()
	{
		Product p = new Product();
		p.setPid(10);
		p.setMod(model());
		return p;
	}
}
