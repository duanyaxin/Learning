package com.jack.imooc.compotition;

import java.util.Date;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		TreeSet<Date> cmp = new TreeSet<Date>();
		cmp.add(new Date());
		
		InstrumentedSet<Date> instrumentedSet = 
				new InstrumentedSet<Date>(new TreeSet<Date>(cmp));
		instrumentedSet.addAll(cmp);
		
		
		
	}
	
}
