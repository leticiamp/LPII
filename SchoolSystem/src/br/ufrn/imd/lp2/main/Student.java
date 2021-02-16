package br.ufrn.imd.lp2.main;

public class Student {
	
	private Exam exam1, exam2;
	
	public Student() {}
	
	public Student(Exam exam1, Exam exam2) {
		this.exam1 = exam1;
		this.exam2 = exam2;
	}
	
	public void setExam1(Exam exam) {
		exam1 = exam;
	}
	
	public void setExam2(Exam exam) {
		exam2 = exam;
	}
	
	public double calcAverage() {
		return ((exam1.totalScore() + exam2.totalScore()) / 2);
	}
}
