package com.example.fibgen.contants;

public abstract class FibNumberConstants {
	/** 
	 * This is resource name as part of the exposed service.
	 * To access the service, it comes after servlet context, e.g., http://<host>:<port>/FibService/fngResource
	 * 
	 */
	public static final String FIBNUMBER_RESOURCE = "/fngResource";
	
	/** 
	 * This is the input parameter used in rest calls
	 */
	public static final String NUMBER = "/{number}";
	
	/** 
	 * This is the input param used in resource without the / and {}
	 */
	public static final String NUMBER_PARAM = "number";
	/** 
	 * This is the maximum number as input.
	 */
	public static int MAX_INPUT_NUMBER = 1000;
	/** 
	 * This is the minimum number as input. Actually it does not make sense to the lower limit as constant, 
	 * but still did it to be in sync with upper limit :)
	 */
	public static int MIN_INPUT_NUMBER = 1;
}
