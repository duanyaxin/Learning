package com.jack.imooc.myinterface;

public interface OneInterface {
	public String  sayHello(String str);
	
	default String sayHi(String st1,String st2){
		return st1+"##"+st2;
	}
}
