package com.tnsif.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
public static void main(String[] args) {
	//ordered,unsorted set.
		LinkedHashSet<Integer>lhSet=new LinkedHashSet<Integer>();
           lhSet.add(10);
           lhSet.add(20);
           lhSet.add(30);
           lhSet.add(40);
           lhSet.add(50);
           lhSet.add(60);
           lhSet.add(70);
           System.out.println("Linked hashset is : "+lhSet);
          // Collections.sort(lhSet);   
           
           //sort using arraylist or treeset
           ArrayList<Integer>arr=new ArrayList<>(lhSet);
           Collections.sort(arr);
           System.out.println("after sort: "+arr);

}
}
