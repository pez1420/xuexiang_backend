package com.leebbs.admin.tests.rq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;


/***
 * http://www.rabbitmq.com/api-guide.html
 * 
 * @author Administrator
 *
 */
public class RqClient {

	public static void main(String[] args) {
		String userName = "qgs";
		String password = "qwerqwer";
		String virtualHost = "qgsvhost";
		String hostName = "192.168.1.121";
		int portNumber = 5672;
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUsername(userName);
		factory.setPassword(password);
		factory.setVirtualHost(virtualHost);
		factory.setHost(hostName);
		factory.setPort(portNumber);
		try {
			Connection conn = factory.newConnection();
			Channel channel = conn.createChannel();
			//channel.close();
			//conn.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
