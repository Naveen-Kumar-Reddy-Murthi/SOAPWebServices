package org.mnr.exception;

public class InvalidInputException extends Exception {
	
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails=errorDetails;
	}
	
	public String getFalutInfo(){
		return this.errorDetails;
		
		/**
		 * This is method needs to written for handling exceptions and returning them
		 * in proper soap message format whenever they are thrown.
		 * Method name has to be exactly "getFalutInfo" and should return String
		 */
	}

}
