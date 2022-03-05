package com.nse;

public class Sub implements Calculate {

	@Override
	public void calculate(double x, double y) {
		System.out.println(x+"-"+y+"="+(x-y));

	}

}
