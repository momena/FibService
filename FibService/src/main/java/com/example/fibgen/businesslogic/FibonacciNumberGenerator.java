/**

 * 
 */
package com.example.fibgen.businesslogic;

import com.example.fibgen.exceptions.FibGenOutOfBoundsException;


/**
 * @author Momena_Ahmed
 *
 */
public interface FibonacciNumberGenerator {
	/**
	 * This method generates upto nth Finonacci number and returns a string with all the numbers..
	 * It accepts a number, n, as input and returns the first n Fibonacci numbers, 
	 * starting from 0. I.e. given n = 5, appropriate output would represent the sequence "0 1 1 2 3". 
 	 * It also does upper and lower limit validation 
	 * @param n the input number
	 * @return a string with all numbers concatenated with a space between each number
	 * @throws FibGenOutOfBoundsException if the input number is not a valid number and it is out of some upper bound
	 * or lower bound (less than 1);
	 */
	String FibNoGenerator(String n) throws FibGenOutOfBoundsException;
}
