package com.jack.imooc.compotition;

import java.util.Date;

public class ErrorSon extends ErrorFather {
	
	private final Date date;
	
	public ErrorSon() {
//		super();
		date = new Date();
	}

	@Override
	public void overrideMe() {
		// TODO Auto-generated method stub
//		super.overrideMe();
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		ErrorSon errorSon = new ErrorSon();
		errorSon.overrideMe();
	}
	
}
