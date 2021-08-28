package com.telstra.tse;

public class Player {
	private Dice d1;
	private Dice d2;
	
	public Player() {
		d1 = new Dice();
		d2 = new Dice();
	}
	
	public int play() {
		return(d1.roll()+d2.roll());
	}
	
	public int getScoreD1() {
		return d1.getfvalue();
	}
	
	public int getScoreD2() {
		return d2.getfvalue();
	}
}
