package com.example.fibgen.businesslogic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.fibgen.exceptions.FibGenOutOfBoundsException;

public class FibonacciNumberGeneratorImplNegativeTests {
	private FibonacciNumberGenerator fng;
	// TODO: Change this msg to read from msg catalog
	private static final String OUT_OF_RANGE_ERROR = "you must enter a number equal to or in between 1 and 1000";
	private static final String INVALID_NUMBER_ERROR = "The input is not a valid number";

	@Before
	public void setUp() throws Exception {
		fng = new FibonacciNumberGeneratorImpl();
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testFibNoGeneratorLowerLimit() throws FibGenOutOfBoundsException {
		thrown.expect(FibGenOutOfBoundsException.class);
		thrown.expectMessage(OUT_OF_RANGE_ERROR);
		String result = fng.FibNoGenerator("0");
		System.out.println("Test testFibNoGeneratorLowerLimit failed!");
	}
	
	@Test
	public void testFibNoGeneratorUpperLimit() throws FibGenOutOfBoundsException {
		thrown.expect(FibGenOutOfBoundsException.class);
		thrown.expectMessage(OUT_OF_RANGE_ERROR);
		String result = fng.FibNoGenerator("1001");
		System.out.println("Test testFibNoGeneratorUpperLimit failed!");
	}
	
	@Test
	public void testFibNoGeneratorInvalidNumber() throws FibGenOutOfBoundsException {
		thrown.expect(FibGenOutOfBoundsException.class);
		thrown.expectMessage(INVALID_NUMBER_ERROR);
		String result = fng.FibNoGenerator("test");
		System.out.println("Test testFibNoGeneratorInvalidNumber failed!");
	}
}
