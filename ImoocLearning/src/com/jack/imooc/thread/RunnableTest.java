package com.jack.imooc.thread;

public class RunnableTest implements Runnable{

	private int tickets = 100;
	  public void run(){
	     while(true){
	     if(tickets > 0){
	       System.out.println(Thread.currentThread().getName() +
	          " is saling ticket " + tickets--);
	      }
	    }
	  }
	
}
