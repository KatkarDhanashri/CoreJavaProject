package com.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AdditionTest {
	//private int sum=1;
   private static int sum=1;
   @Test
   void addingTwo() {
	   sum+=2;
	   assertEquals(3, sum);
   }
   @Test
	void addingThreeReturnsFour() {
		sum += 3;
		assertEquals(4, sum);
	}


	  @BeforeEach 
	  void beforeEachTest() 
	  { sum = 1; }

	  @AfterEach
	  void afterEachTest() 
	  { sum = 0; }

}
   

