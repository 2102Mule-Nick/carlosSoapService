package com.revature.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.service.ServiceOne", serviceName="serviceOne")
public class ServiceOneImpl implements ServiceOne {

	@Override
	public int addTwoNumbers(int numOne, int numTwo) {
		// TODO Auto-generated method stub	
		
		return (numOne + numTwo);
	}

}
