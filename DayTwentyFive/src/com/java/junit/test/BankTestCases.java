package com.java.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.java.junit.dao.DBUtil;
import com.java.junit.service.SavingAccountService;

class BankTestCases {
	SavingAccountService service;

	@ParameterizedTest
	@ValueSource(ints = { 1001, 1006 })
	void validateAccountTest(int accNo) {
		service = new SavingAccountService();
		boolean status = service.validateAccount(accNo);
		// assertEquals(true, status);
		assertTrue(status);
	}

	@Test
	void testNotNullConnection() {
		assertNotNull(DBUtil.getConnection());
	}


}