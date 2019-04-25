package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetCollection {
	public static void main(String args[]){
		Set<String> setColor=new HashSet<String>();
		setColor.add("yellow");
		setColor.add("Sandel");
		setColor.add("blue");
		setColor.add("green");
		
	Iterator<String> iterator=setColor.iterator();
	while(iterator.hasNext()){
		String color=iterator.next();
		System.out.println(color);
	}
	for(String color:setColor){
		System.out.println(color +"--");
	}
	System.out.println(setColor.size());
	System.out.println(setColor.isEmpty());
	String[] list=new String[5];
	setColor.toArray(list);
	for(String color:list){
		System.out.println(color);
	}
		
	}

}
