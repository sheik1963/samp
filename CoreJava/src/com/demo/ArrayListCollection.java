package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList color=new ArrayList<>();
	color.add("red");
	color.add("orange");
	color.add("white");
	color.add("blue");
	 System.out.println(color.get(0));
      color.add(0, "pink");
      color.add(5,"yellow");
     
      System.out.println(color.get(0));
      Collections.sort(color);
      System.out.println(color);
      color.set(0, "black");
      color.remove(3);
      color.remove("blue");
      Collections.sort(color);
      System.out.println(color);
      System.out.println(color.contains("red"));
      
      
      System.out.println(color);
      Collections.shuffle(color);
      System.out.println(color);
      Collections.shuffle(color);
      System.out.println(color);
      Collections.reverse(color);
      System.out.println(color);
      List listCopy = color.subList(3, 5);
      System.out.println(listCopy);
      Collections.swap(listCopy, 0, 1);
      System.out.println(listCopy);
      List cloneList=(List) color.clone();
      System.out.println(cloneList);
      System.err.println(color.size());
      color.trimToSize();
      System.err.println(color.size());
      
//      Collections.copy(listCopy, color);
//      System.out.println(listCopy);
      
	/*for(Object colors:color){
		System.out.println(colors);
		
	}
*/
	}

}
