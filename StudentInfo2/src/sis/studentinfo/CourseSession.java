package sis.studentinfo;


import java.util.*;

/**
 * Provides a representation of single-semester
 * session of a specific university course.
 * @author emaph
 */
public class CourseSession {
    private final String department;
    private final String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private final Date startDate;
    private static int count;
    private int numberOfCredits;

    /**
     * Creates a CourseSession
     * @param department
     * @param number
     * @param startDate
     */
    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public static CourseSession create(
            String department,
            String number,
            Date startDate) {
        incrementCount();
        return new CourseSession(department, number, startDate);
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    /**
     * @return the Department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the Session number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return Number of Students enrolled in the course session
     */
    public int getNumberOfStudents() {
        return students.size();
    }

    /**
     * @return the start date of the course session.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Enroll the Student in the course session
     * @param student to enroll
     */
    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    /**
     * @param index of Student starting at 0
     * @return the Student at the index.
     */
    public Student get(int index) {
        return students.get(index);
    }

    /**
     * Return the list of Students.
     *
     * @return List of Students
     */
    public ArrayList<Student> getAllStudents() {
        return students;
    }

    /**
     * @return Date the last date of course session
     */
    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  // weeks * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    static void resetCount() {
        count = 0;
    }

    static int getCount() {
        return count;
    }

    private static void incrementCount() {
        ++count;
    }

}
