package com.telstra.exception;

//this is a checked/Runtime exception
public class InsufficientLeave extends Exception {

	private String msg;
	
	public InsufficientLeave(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
	

}
