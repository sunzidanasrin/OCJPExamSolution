package com.urmi.question5;

public class Score implements Comparable<Score>{

	private int wins, losses;
	
	

	public Score(int wins, int losses) {
		super();
		this.wins = wins;
		this.losses = losses;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}
	
	public static void main(String[] args) {
		Score score = new Score(5,3);
		System.out.println(score);
	}

	@Override
	public String toString() {
		return "Score [wins=" + wins + ", losses=" + losses + "]";
	}

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	//comparable interface compareTo method k implement kre
	
	
}
