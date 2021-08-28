package com.telstra.tse;

public class Main {

	public static void main(String[] args) {
		
		Player P1 = new Player();
		Player P2 = new Player();
		
		int P1Score = P1.play();
		System.out.println(P1.getScoreD1());
		System.out.println(P1.getScoreD2());
		System.out.println("Total Score: "+P1Score);
		
		int P2Score = P2.play();
		System.out.println(P2.getScoreD1());
		System.out.println(P2.getScoreD2());
		System.out.println("Total Score: "+P2Score);
		
		if(P1Score>P2Score) {
			System.out.println("P1 Wins !!!");
		}
		else if (P1Score==P2Score) {
			System.out.println("It is a Draw !!");
		}
		else {
			System.out.println("P2 Wins !!!");
		}
	}

}
