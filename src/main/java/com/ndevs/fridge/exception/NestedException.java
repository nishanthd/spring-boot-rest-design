package com.ndevs.fridge.exception;

/**
 * Abstract superclass for all exceptions thrown in the controller package and
 * subpackages.
 * 
 * This class is to force every exception class to define
 * {@code:getErrorCode()} method.
 * 
 * @author Nishanth Dharmaraju
 *
 */
public abstract class NestedException extends Exception {

	NestedException(String message) {
		super(message);
	}

	/**
	 * Returns error code of the exception
	 */
	public abstract String getErrorCode();

}
