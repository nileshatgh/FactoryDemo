package com.nse;

public class CalculateFactory {

	Calculate obj = null;
	
	public Calculate getObject(String type) {
		
		if(type.toLowerCase().equals("add"))
		{
			obj = new Add();
		}
		else if (type.toLowerCase().equals("sub"))
		{
			obj = new Sub();
		}
		else if (type.toLowerCase().equals("mul"))
		{
			obj = new Mul();
		}
		else if (type.toLowerCase().equals("div"))
		{
			obj = new Div();
		}
		else
		{
			System.out.println("No such operation");
		}
		return obj;
	}
}
