package com.example.fibgen.businesslogic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.fibgen.exceptions.FibGenOutOfBoundsException;

public class FibonacciNumberGeneratorImplPositiveTests {
	FibonacciNumberGenerator fng;

	@Before
	public void setUp() throws Exception {
		fng = new FibonacciNumberGeneratorImpl();
	}
	
	@Test
	public void testFibNoGeneratorSmallInput1() throws FibGenOutOfBoundsException {
		String result = fng.FibNoGenerator("5");
		Assert.assertEquals("0 1 1 2 3", result);
	}
	
	@Test
	public void testFibNoGeneratorSmallInput2() throws FibGenOutOfBoundsException {
		String result = fng.FibNoGenerator("2");
		Assert.assertEquals("0 1", result);
	}
	
	@Test
	public void testFibNoGeneratorMediumInput() throws FibGenOutOfBoundsException {
		String result = fng.FibNoGenerator("12");
		Assert.assertEquals("0 1 1 2 3 5 8 13 21 34 55 89", result);
	}
	
	@Test
	public void testFibNoGeneratorLargeInput1() throws FibGenOutOfBoundsException {
		String result = fng.FibNoGenerator("1000");
		String[] numbers = result.split(" ");
		Assert.assertEquals(numbers.length, 1000);
	}	
	
	@Test
	public void testFibNoGeneratorLargeInput2() throws FibGenOutOfBoundsException {
		String result = fng.FibNoGenerator("99");
		String[] numbers = result.split(" ");
		Assert.assertEquals("135301852344706746049", numbers[numbers.length-1]);
	}

}
