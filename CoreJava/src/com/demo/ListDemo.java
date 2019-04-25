package com.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<List<Integer>> main=new ArrayList();
       List<Integer> sub=new ArrayList();
         sub.add(4);
         sub.add(3);
         sub.add(200);
         main.add(sub);
         sub.removeAll(sub);
         sub.add(2);
         sub.add(2);
         sub.add(100);
         main.add(sub);
         
         System.out.println(main.get(0));
         System.out.println(main.get(0).get(2));
         
         List<Integer> readOnly= (List<Integer>) Collections.unmodifiableList(sub);
          readOnly.add(100);
         System.out.println(readOnly);
           
         int n = 20; 
         System.out.println("Count of trailing 0s in " +  
                                            n +"! is " +  
                                  findTrailingZeros(n)); 
        	
         
         
	}
	// Function to return trailing  
    // 0s in factorial of n 
    static int findTrailingZeros(int n) 
    { 
        // Initialize result 
        int count = 0; 
  
        // Keep dividing n by powers  
        // of 5 and update count 
        for (int i = 5; n / i >= 1; i *= 5) 
            count += n / i; 
  
        return count; 
    } 

}
