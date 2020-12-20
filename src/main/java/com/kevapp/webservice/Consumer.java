package com.kevapp.webservice;



public class Consumer {
	public static void main(String[] args) {
		CalculatorImplService service = new CalculatorImplService();

		Calculator r = service.getCalculatorImplPort();

		System.out.println("Suma: " + r.operation(1, 2, 2));
		System.out.println("Resta: " + r.operation(2, 2, 2));
		System.out.println("Mult: " + r.operation(3, 2, 2));
		System.out.println("Div: " + r.operation(4, 2, 2));
	}

}
