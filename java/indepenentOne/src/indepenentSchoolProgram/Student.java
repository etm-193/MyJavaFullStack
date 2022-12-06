package indepenentSchoolProgram;

public class Student implements Comparable<Student>{
    
    private String name;
    private int grade;
    private double gpa;
    
    public Student(String n, int gr, double g) {
        name = n;
        grade = gr;
        gpa = g;           
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public String toString() {
        return "{Name::" + getName() + "Grade::" + getGrade() + "GPA::" + getGpa();};
    
    
    public boolean equals(Student other) {
        return this.getGpa() == other.getGpa();
    }
    
    public int compareTo(Student temp) {
        Student other = (Student) temp;
        
        if(getGpa() > other.getGpa()) {
            return 1;
        } else if (getGpa() < other.getGpa()){
            return -1;
        } else {
            return 0;
        }
        
    }

    
    
}
