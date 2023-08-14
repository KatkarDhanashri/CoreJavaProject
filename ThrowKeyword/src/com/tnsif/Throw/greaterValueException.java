package com.tnsif.Throw;

public class greaterValueException extends Exception {

	public greaterValueException(String string) {
		super(string);
	}

	public greaterValueException() {
		super("greaterValueException");
	}
	

}