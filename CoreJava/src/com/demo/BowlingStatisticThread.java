package com.demo;

public class BowlingStatisticThread implements  Runnable,Cloneable {
 
	int a;
	public void run()
	{
		 for(int i=0;i<1000;i++)
		System.err.println("Run BowlingStatisticThread" +i);
	}

	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
}
