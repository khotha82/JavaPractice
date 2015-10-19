package com.example.jms;

import org.apache.activemq.broker.BrokerService;

/**
 * Created by krishna_hotha on 5/18/15 2015.
 */
public class BrokerStart {

	public static void main(String[] args) throws Exception {

		BrokerService broker = new BrokerService();

		// configure the broker
		broker.addConnector("tcp://localhost:61616");

		broker.start();
	}
}
