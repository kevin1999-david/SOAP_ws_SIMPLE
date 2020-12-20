package com.kevapp.webservice;

import javax.jws.WebService;



@WebService(endpointInterface = "com.kevapp.webservice.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public double operation(int option, int val1, int val2) {
		double response = 0;

		switch (option) {
		case 1:
			response = val1 + val2;
			break;
		case 2:
			response = val1 - val2;
			break;
		case 3:
			response = val1 * val2;
			break;
		case 4:
			response = val1 / val2;
			break;

		default:
			break;
		}

		return response;
	}

}
