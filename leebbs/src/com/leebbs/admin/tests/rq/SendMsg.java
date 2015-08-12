package com.leebbs.admin.tests.rq;


import java.io.IOException;  
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;  
import com.rabbitmq.client.Connection;  
import com.rabbitmq.client.ConnectionFactory;  


public class SendMsg {
	private final static String userName = "qgs";
	private final static String password = "qwerqwer";
	private final static String virtualHost = "qgsvhost";
	private final static String hostName = "192.168.1.121";
	private final static int portNumber = 5672;
	private final static String exchange_name = "qgswaf";  
	
    private final static String QUEUE_NAME = "hello";  
      
    public static void main(String[] args) throws IOException, TimeoutException {  
        // AMQP的连接其实是对Socket做的封装, 注意以下AMQP协议的版本号，不同版本的协议用法可能不同。  
        ConnectionFactory factory = new ConnectionFactory();  
		factory.setUsername(userName);
		factory.setPassword(password);
		factory.setVirtualHost(virtualHost);
		factory.setHost(hostName);
		factory.setPort(portNumber);
		
        Connection connection = factory.newConnection();  
        // 下一步我们创建一个channel, 通过这个channel就可以完成API中的大部分工作了。  
        Channel channel = connection.createChannel();  
        
        //生命exchange_name类型
        channel.exchangeDeclare(exchange_name, "direct");
        
        // 为了发送消息, 我们必须声明一个队列，来表示我们的消息最终要发往的目的地。  
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);  
        String message = "Hello World!";  
        // 然后我们将一个消息发往这个队列。  
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());  
        System.out.println("[" + message + "]");  
          
        // 最后，我们关闭channel和连接，释放资源。  
        channel.close();  
        connection.close();  
    }  

}
