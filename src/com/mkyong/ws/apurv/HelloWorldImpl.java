package com.mkyong.ws.apurv;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.apurv.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World  "+this.hashCode()+" : " + name.toUpperCase();
	}

	@Override
	public Long addNumbers(Long first, Long second) {
		return first  + second;
	}

}
