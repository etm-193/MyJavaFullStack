package hashMapPractice;

import java.util.HashMap;
import java.util.Objects;

public class Student {

	private String studentName;
	private Double gpa;
	
	HashMap<String, Double> grades;
	public Student() {
		this.grades = new HashMap<>();
	}
	
	//constructor
	public Student(String studentName, Double gpa) {
		super();
		this.studentName = studentName;
		this.gpa = gpa;
	}
	//getters and setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gpa, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(gpa, other.gpa) && Objects.equals(studentName, other.studentName);
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", gpa=" + gpa + "]";
	}
	
	public double findHighestGrade() {
		double maxGrade = 0;
		for (String student: grades.keySet()) {
			Double grade = grades.get(student);
			maxGrade = Math.max(maxGrade, grade);
		}
		return maxGrade;
	}
	
	
	//bonus method
	
	public  String findTopStudent() {
		String result = "";
		double topScore = findHighestGrade();
		for(String name: grades.keySet()) {
			Double score = grades.get(name);
			if(score == topScore)
				result += name + " ";
		}
		return result;
	}
	
}
