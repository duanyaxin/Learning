package com.jack.imooc.thread;


public class ForTest {

	public static void main(String[] args) {
		Thread thread1 = new ThreadTest();
		thread1.start();
		
		/*RunnableTest thread2 = new RunnableTest();
		new Thread(thread2).start();*/
	}
	
}
