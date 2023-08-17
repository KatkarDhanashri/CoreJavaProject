package com.tnsif.hashset;

import java.util.HashSet;
import java.util.Spliterator;

public class HashsetDemo {
static void addElements(HashSet<Integer>numberHashSet) {
	numberHashSet.add(100);
	numberHashSet.add(56);
	numberHashSet.add(16);
	numberHashSet.add(65);
	numberHashSet.add(78);
	numberHashSet.add(89);
	numberHashSet.add(32);
	numberHashSet.add(12);//no through error
	//System.out.println(numberHashSet.add(16));//false
}
public static void main(String[] args) {
	
	HashSet<Integer>numberHashSet=new HashSet<Integer>();
	addElements(numberHashSet);
	System.out.println(numberHashSet);
	
	
	//number set 2
	HashSet<Integer>numberHashSet2=new HashSet<Integer>();;
//	numberHashSet2.add(18);
//	numberHashSet2.add(5);
//	numberHashSet2.add(1);
//	numberHashSet2.add(43);
//	numberHashSet2.add(65);
//	numberHashSet2.add(34);
//	numberHashSet2.add(32);
//	numberHashSet.add(16);
//	numberHashSet.add(65);
	
	System.out.println(numberHashSet2);
	
	numberHashSet2.clear();
	addElements(numberHashSet2);
	//union of two sets
	numberHashSet2.addAll(numberHashSet);
	System.out.println("Union elements: "+numberHashSet2);
	
	numberHashSet2.clear();
	addElements(numberHashSet2);
	//intersection of two sets
	numberHashSet2.retainAll(numberHashSet);
	System.out.println("Intersection elements: "+numberHashSet2);
	
	//set difference
	numberHashSet2.removeAll(numberHashSet);
	System.out.println("Difference set : "+numberHashSet2);

	//splitIterator
	Spliterator<Integer>spit=numberHashSet.spliterator();
	spit.forEachRemaining(System.out::println);
}
}
