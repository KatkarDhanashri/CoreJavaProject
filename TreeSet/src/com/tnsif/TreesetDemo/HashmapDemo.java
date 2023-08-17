package com.java.hashmapdemo;

import java.util.HashMap;

public class HashmapDemo {
	public static void main(String[] args) {
		
      HashMap<String ,Integer>hm=new HashMap<String ,Integer>();
      hm.put("England", 1);
      hm.put("Germany", 3);
      hm.put("Norway", 5);
      hm.put("USA", 7);
      System.out.println(hm);
      
      //print keys using keyset
      for(String i:hm.keySet()) {
    	  System.out.println(i);
      }
      //print values
      for(Integer i:hm.values()) {
    	  System.out.println(i);
      }
      //print keys and values
      for(String i:hm.keySet()) {
    	  System.out.println("keys:"+i+"  Values:"+hm.get(i));
      }
      //access value using get()
      System.out.println(hm.get("Norway"));
      
      //remove an element
      System.out.println(hm.remove("Germany"));
      
      //remove all using clear method
      hm.clear();
      System.out.println(hm);
	}
}
