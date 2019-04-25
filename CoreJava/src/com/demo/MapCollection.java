package com.demo;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
public static void main(String[] args){
	HashMap<Integer, String> map1=new HashMap<>();
	map1.put(1, "black");
	map1.put(2, "yellow");
	map1.put(3, "pruple");
	HashMap<Integer, String> map2=new HashMap<>();
	map2.put(4, "yellow");
	map2.put(5, "red");
	map1.putAll(map2);
	map2.clear();
	System.out.println(map1);
	
/*	for(Map.Entry x:map1.entrySet()){
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		
	}
*/}

     
}
