package com.nse;

public class Mul implements Calculate {

	@Override
	public void calculate(double x, double y) {
		System.out.println(x+"*"+y+"="+(x*y));

	}

}
