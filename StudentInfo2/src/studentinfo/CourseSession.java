package studentinfo;

import java.util.*;


/**
 * Provides a represent of a single-semester
 * session of a specific university course
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

    /**
     * Constructs a CourseSession starting on specific date
     *
     * @param department Department number for the Course
     * @param number Course number
     * @param startDate  the date on which the CourseSession begins
     */
    public CourseSession(String department, String number, Date startDate) {
        this.deparment = department;
        this.number = number;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
    }

    /**
     * @return Department number
     */
    String getDepartment() {
        return deparment;
    }
    
    /**
     * @return Course number.
     */
    String getNumber() {
        return number;
    }
    
    /**
     * Enroll the given Student
     * @param student to enroll.
     */
    void enroll(Student student) {
        students.add(student);
    }
    
    /**
     * Rturn STudent at a given index.
     * @param idx of Student
     * @return Student and index.
     */
    Student get(int idx) {
        return students.get(idx);
    }

    /**
     * @return number of enrolled Students
     */
    int getNumberOfStudents() {
        return students.size();
    }

    /**
     * @return Date the last date of the course session
     */
    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  // weeks* days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }
}
