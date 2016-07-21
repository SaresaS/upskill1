package com.saresastore.spring.upskill1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//instiating spring bean
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Product product = (Product)context.getBean("product");
		
		product.speak();
	}

}
