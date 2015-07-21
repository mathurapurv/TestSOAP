package com.mkyong.endpoint;

import javax.xml.ws.Endpoint;

import com.mkyong.ws.apurv.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
	
//	private static final String EP_URL = "http://ipv4.fiddler:9999/ws/hello/mkyong";
	private static final String EP_URL = "http://localhost:9999/ws/hello/mkyong";
 
	public static void main(String[] args) {
		System.out.println("Start publishing...");
	   Endpoint.publish(EP_URL, new HelloWorldImpl());
	   System.out.println("Service published...");
    }
 
}
