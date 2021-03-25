package com.revature.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.service.ServiceTwo", serviceName="serviceTwo")
public class ServiceTwoImpl implements ServiceTwo {

	@Override
	public String multiplyName(String name) {
		// TODO Auto-generated method stub
		
		String nameTimes = "";
		
		for (int i = 0; i < 4; i++) {
			nameTimes += name + "\n";
		}
		
		return nameTimes;
	}

}
