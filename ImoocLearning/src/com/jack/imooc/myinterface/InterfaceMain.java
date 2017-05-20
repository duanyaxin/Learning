package com.jack.imooc.myinterface;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {

	public static void main(String[] args) {
		
		TwoInterfaceImpl tif = new TwoInterfaceImpl();
//		System.out.println(tif.sayHi("@@@"));
		System.out.println(tif.haha("pig", "猪头"));
		
		/*OneInterfaceImpl oif = new OneInterfaceImpl();
		System.out.println(oif.sayHi("3223", "%%%%%"));
		System.out.println(oif.sayHello("okokok"));
		List<String> list = new ArrayList<String>();*/
	}
}
