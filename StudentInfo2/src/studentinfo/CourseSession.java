package studentinfo;

import java.util.ArrayList;


/**
 * Represents a Course Session in the application
 * @author emaph
 */
public class CourseSession {
    private String deparment;
    private String number;
    ArrayList<Student> students;
            
    public CourseSession(String department, String number) {
        this.deparment = department;
        this.number = number;
        this.students = new ArrayList<Student>();
    }
    
    String getDepartment() {
        return deparment;
    }
    
    String getNumber() {
        return number;
    }
    
    void enroll(Student student) {
        students.add(student);
    }
    
    ArrayList<Student> getAllStudents(){
        return students;
    }

    int getNumberOfStudents() {
        return students.size();
    }
}
