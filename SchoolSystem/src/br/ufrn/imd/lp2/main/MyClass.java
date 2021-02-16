package br.ufrn.imd.lp2.main;

public class MyClass {
	private Student student1, student2, student3;
	
	public MyClass() {}
	
	public MyClass(Student S1, Student S2, Student S3) {
		this.student1 = S1;
		this.student2 = S2;
		this.student3 = S3;
	}

	public double calcAverage() {
		return (student1.calcAverage() + student2.calcAverage() + student3.calcAverage()) / 3;
	}

	// Getters and setters

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	public Student getStudent2() {
		return student2;
	}

	public void setStudent2(Student student2) {
		this.student2 = student2;
	}

	public Student getStudent3() {
		return student3;
	}

	public void setStudent3(Student student3) {
		this.student3 = student3;
	}

}