package com.learn.mq.activemq.SimpleQueue;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

public class SimpleQueueConsumerListener implements MessageListener {

	private String job;
	
	public SimpleQueueConsumerListener(String job) {
		this.job = job;
	}

	public void onMessage(Message message) {
		try {
			//do something here
			System.out.println(job + " id:" + ((ObjectMessage)message).getObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
