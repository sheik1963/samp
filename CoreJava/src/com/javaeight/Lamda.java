package com.javaeight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Messager{
	//void displayMsg();
	void displayMsg(String name);
}
public class Lamda {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Messager Messager =()-> System.out.println("MSG Displayed");
		//Messager.displayMsg();
		Messager Messager=(name)->System.out.println(name);
		
		List<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//Stream
		list.stream().sorted().forEach(s->System.out.println(s));
		list.stream().sorted(Comparator.reverseOrder()).forEach(z->System.out.println(z));

		
	}

}
