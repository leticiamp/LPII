public class SchoolSystem {
	public static void main(String args[]) {
		
		// Student 1
		Exam exam1S1 = new Exam(3.0, 3.5);
		Exam exam2S1 = new Exam(4.0, 4.0);
		
		Student S1 = new Student(exam1S1, exam2S1);
		
		// Student 2
		Exam exam1S2 = new Exam(4.5, 5.0);
		Exam exam2S2 = new Exam(1.5, 1.5);
		
		Student S2 = new Student(exam1S2, exam2S2);
		
		// Student 3
		Exam exam1S3 = new Exam(3.0, 3.5);
		Exam exam2S3 = new Exam(4.5, 4.5);
		
		Student S3 = new Student(exam1S3, exam2S3);
		
		// Class
		Class myClass = new Class(S1, S2, S3);
		
		sysout
		
		System.out.printf("Total score -> Exam 2 -> Student 1: " + exam2.totalScore() + "\n");
		
	}
}