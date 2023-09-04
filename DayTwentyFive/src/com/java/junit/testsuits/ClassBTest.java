package com.java.junit.testsuits;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassBTest {
	@Test
	@Tag("development")
	void testCaseB(TestInfo testInfo) { //run in development environments
	}
}