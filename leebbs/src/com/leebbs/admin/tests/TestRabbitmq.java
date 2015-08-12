package com.leebbs.admin.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRabbitmq {
	
	private static MessageConverter messageConverter = new SimpleMessageConverter();  
	
	private static RabbitTemplate rabbitTempalte;
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {
		 try {
			 ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml",
					 "applicationContext-mybatis.xml", "applicationContext-rabbit.xml"});

			 rabbitTempalte = (RabbitTemplate) cxt.getBean("rabbitTemplate");  


		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }	
	
	@Test
	public void send() {
		 String message = "fuck you very much!!";  
         
	     rabbitTempalte.send("qgswaf", "q_task_ddos", messageConverter.toMessage(message, null));  
	        
	}
}
