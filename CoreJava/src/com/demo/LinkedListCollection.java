package com.demo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> colorList=new LinkedList<String>();
		colorList.add("Red");
		colorList.add("blue");
		colorList.add("green");
		colorList.add("cyan");
		
		System.out.println(colorList);
		Collections.reverse(colorList);
		System.out.println(colorList);
		
		colorList.add(0,"purple");
		System.out.println(colorList);
		colorList.addFirst("yellow");
		colorList.addLast("sandel");
		System.out.println(colorList);
		colorList.offerFirst("pink");
		System.out.println(colorList.peek());
		System.out.println(colorList.peekLast());
		System.out.println(colorList.peekFirst());
			
		System.out.println(colorList);
		/*for(String color:colorList){
			 System.out.println(color);
		}*/

	}

}
