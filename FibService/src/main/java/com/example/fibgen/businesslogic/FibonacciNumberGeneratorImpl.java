/**

 * 
 */
package com.example.fibgen.businesslogic;

import java.math.BigInteger;

import com.example.fibgen.contants.FibNumberConstants;
import com.example.fibgen.exceptions.FibGenOutOfBoundsException;
/**
 * @author Momena_Ahmed
 *
 */

public class FibonacciNumberGeneratorImpl implements FibonacciNumberGenerator {

	public String FibNoGenerator(String  number) throws FibGenOutOfBoundsException {
		StringBuilder result = new StringBuilder();
		int n = validateInput(number, FibNumberConstants.MIN_INPUT_NUMBER, FibNumberConstants.MAX_INPUT_NUMBER);
		BigInteger[] vec = new BigInteger[n];
		vec[0] = BigInteger.ZERO;
		vec[1] = BigInteger.ONE;
		
		for (int i = 2; i < n; i++) {
			vec[i] = vec[i - 1].add(vec[i - 2]);
		}
		
		for (int i = 0; i <= vec.length-1; i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(vec[i]);
		}
		return result.toString();
	}
	
    
    // TODO: IMHO, Validation should happen in a centralized location
	
	/**
	 * @param number the input number to be validated as String
	 * @param lowerLimit
	 * @param upperLimit
	 * @return the int conversion of the input number
	 * @throws FibGenOutOfBoundsException if the input is out of the range or if not a valid int
	 */
	private int validateInput(String number, int  lowerLimit, int upperLimit) throws FibGenOutOfBoundsException {
		int n = 0;
		try {
			n = Integer.parseInt(number);
		} catch (NumberFormatException e) {
			//TODO: add msg catalog instead of hard-coded msg
			throw new FibGenOutOfBoundsException("The input is not a valid number");
		}
		if ((n <= lowerLimit) || (n > upperLimit)) {
			//TODO: add msg catalog instead of hard-coded msg
			throw new FibGenOutOfBoundsException("you must enter a number equal to or in between " + lowerLimit + " and " + upperLimit);
		}
		return n;
	}
}
