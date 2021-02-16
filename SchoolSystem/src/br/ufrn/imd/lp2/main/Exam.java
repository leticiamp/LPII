package br.ufrn.imd.lp2.main;

public class Exam {
	
	private double scorePart1, scorePart2;
	
	public Exam(double scorePart1, double scorePart2) {
		this.scorePart1 = scorePart1;
		this.scorePart2 = scorePart2;
	}
	
	public void setScorePart1(double score) {
		this.scorePart1 = score;
	}
	
	public void setScorePart2(double score) {
		this.scorePart2 = score;
	}
	
	public double totalScore() {
		double totalScore = scorePart1 + scorePart2;
		if (totalScore > 10.0) {
			totalScore = 10.0;
		}
		return totalScore;
	}
}