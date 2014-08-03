/**
 * 
 */
package com.example.fibgen.exceptions;

import java.io.Serializable;

/**
 * @author Momena_Ahmed
 *
 */
public class FibGenOutOfBoundsException extends Exception implements Serializable{
	public FibGenOutOfBoundsException() {
	}

	public FibGenOutOfBoundsException(String message) {
		super(message);
	}

	public FibGenOutOfBoundsException(Throwable cause) {
		super(cause);
	}

	public FibGenOutOfBoundsException(String message, Throwable cause) {
		super(message, cause);
	}
}
