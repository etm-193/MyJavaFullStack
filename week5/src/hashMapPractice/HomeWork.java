package hashMapPractice;

import java.util.HashMap;

public class HomeWork {

	public static void main(String[] arg) {
		
		
	
		HashMap<String, Double> grades = new HashMap<>();
		
		Student student1 = new Student("Billy", 3.0);
		Student student2 = new Student("Tim", 3.9);
		Student student3 = new Student("Kim" , 4.0);
		Student student4 = new Student("Jully", 3.5);
		Student student5 = new Student("Dana", 3.6);
	
		grades.put(student1.getStudentName(), student1.getGpa());
		grades.put(student2.getStudentName(), student2.getGpa());
		grades.put(student3.getStudentName(), student3.getGpa());
		grades.put(student4.getStudentName(), student4.getGpa());
		grades.put(student5.getStudentName(), student5.getGpa());
		
		System.out.println(grades.toString());
		Double maxGrade = (double) 0;
		for (String student: grades.keySet()) {
			Double grade = grades.get(student);
			maxGrade = Math.max(maxGrade, grade);
		}
		System.out.println(maxGrade);
		
		String result = "";
		double topScore = maxGrade;
		for(String name: grades.keySet()) {
			Double score = grades.get(name);
			if(score == topScore)
				result += name + " ";
		}
		System.out.println(result + " is the top student with a grade of " + maxGrade);
	
	}
	
}
