package com.java.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
@ParameterizedTest
@ValueSource(strings = { "racecar", "radar","madam","string"})
void testPalindromes(String word) {
	assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
}
}
