package studentinfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Represents a Course Session in the application
 * @author emaph
 */
public class CourseSession {
    private String deparment;
    private String number;
    private ArrayList<Student> students;
    private Date startDate;
            
    public CourseSession(String department, String number) {
        this.deparment = department;
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public CourseSession(String department, String number, Date startDate) {
        this.deparment = department;
        this.number = number;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
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
    
    Student get(int idx) {
        return students.get(idx);
    }

    int getNumberOfStudents() {
        return students.size();
    }

    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        Date endDate = calendar.getTime();
        return endDate;
    }
}
