package com.ecw.stringKata;

public class NegativeNotAllowedException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7804998512722122336L;

	public NegativeNotAllowedException(String str) {
		super(str);
	}
}
