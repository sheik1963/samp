package com.demo;

public class ThreadDemo {
	public static void main(String args[]) throws InterruptedException, CloneNotSupportedException {
		
//		System.out.println("Start main");
//		BattingStatisticThread b1=new BattingStatisticThread();
//		b1.start();
		
	/*	BowlingStatisticThread bo2=new BowlingStatisticThread();
		Thread t1=new Thread(bo2);
		Thread t2=new Thread(bo2);
		t1.start();
		t2.join();*/
		
			
		BowlingStatisticThread bo1=new BowlingStatisticThread();
		bo1.a=10;
		System.out.println(bo1.a);
		BowlingStatisticThread bo2=(BowlingStatisticThread) bo1.clone();
		bo1.a=20;
		System.out.println(bo2.a);

		String s1=new String("hello World");
		String s2=new String("hello World");
		
		String sl1="hello World";
		String sl2="hello World";
		
		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(sl1));
		 System.out.println(s1==sl1);

		//throw new RuntimeException("hi");
		
		try {
			throw new Exception("hi");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

}
