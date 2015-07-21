package com.mkyong.endpoint;

import javax.xml.ws.Endpoint;

import com.mkyong.ws.apurv.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello/mkyong", new HelloWorldImpl());
    }
 
}
