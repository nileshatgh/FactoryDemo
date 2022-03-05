package com.nse;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double x = input.nextDouble();
		System.out.println("Enter second number: ");
		double y = input.nextDouble();
		
		System.out.println("What would you like to do?");
		String type=input.next();
		
		CalculateFactory CF = new CalculateFactory();
		Calculate obj = CF.getObject(type);
		obj.calculate(x, y);

	}

}
