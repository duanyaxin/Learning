package com.jack.imooc.myinterface;

public interface TwoInterface {
//	public String sayHi(String str){
//		return str;
//	}
	public String sayHi(String str);
	default String haha(String s1,String s2){
		return s1+s2;
	}
}
