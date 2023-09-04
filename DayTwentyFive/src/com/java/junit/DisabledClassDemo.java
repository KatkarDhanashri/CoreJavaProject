package com.java.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledClassDemo {
  @Test
  void Test1() {
	  System.out.println("Test1");
  }
  @Disabled
	@Test
	void test2() {
		System.out.println("test 2");
	}

	@Test
	void test3() {
		System.out.println("test 3");
	}
}
