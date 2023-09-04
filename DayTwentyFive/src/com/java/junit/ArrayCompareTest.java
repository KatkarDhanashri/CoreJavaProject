package com.java.junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayCompareTest {
@Test
  public void ArrayCompareSort() {
	int[] numbers = { 12, 3, 4, 1 };
	int[] expected = { 1, 3, 4, 12 };
	Arrays.sort(numbers);
	assertArrayEquals(expected,numbers);
}
@Test
void testArrayAsNullArray()
{
	int numbers[]= null;
	Assertions.assertThrows(NullPointerException.class, () -> Arrays.sort(numbers));

}
}
