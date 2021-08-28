package com.telstra.exception;

public class NegativePrice extends Exception{

	private static final long serialVersionUID = 1L;

	public NegativePrice(String s)
	{
		super(s);
	}
}
