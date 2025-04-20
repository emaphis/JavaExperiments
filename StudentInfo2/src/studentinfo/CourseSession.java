package studentinfo;

import java.util.ArrayList;
import java.util.*;

/**
 * Provides a representation of a single semester session of a specific
 * university course.
 *
 * @author emaph
 */
class CourseSession {

    private final String department;
    private final String number;
    private final ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    /**
     * Constructs a CourseSession starting on a specific date
     *
     * @param department the department code
     * @param number the session number
     * @param startDate the date on which the CourseSession begins.
     */
    CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    /**
     * @return the department code
     */
    String getDepartment() {
        return department;
    }

    /**
     * Return the session number
     *
     * @return the session number
     */
    String getNumber() {
        return number;
    }

    /**
     * Return the number of Students enrolled in the session
     *
     * @return the number of students
     */
    int getNumberOfStudents() {
        return students.size();
    }

    /**
     * Enroll the Student in the session
     *
     * @param student
     */
    void enroll(Student student) {
        students.add(student);
    }

    /**
     * Return the Student given an index
     *
     * @param index of the Student
     * @return the Student
     */
    Student get(int index) {
        return students.get(index);
    }

    /**
     * @return the StartDate
     */
    Date getStartDate() {
        return startDate;
    }

    /**
     * Course end date is 16 weeks after start date
     *
     * @return course end date
     */
    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  // weeks * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    /**
     * @return list of Students
     */
    ArrayList<Student> getAllStudents() {
        return students;
    }

}
