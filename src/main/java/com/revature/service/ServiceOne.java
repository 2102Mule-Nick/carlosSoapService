package com.revature.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServiceOne {

	@WebMethod
	int addTwoNumbers(int numOne, int numTwo);
}
