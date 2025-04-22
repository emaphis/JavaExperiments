package sis.studentinfo;


/**
 * Represents an individual Student in the system.
 * @author emaph
 */
public class Student {
    private final String name;

    /**
     * Create a Student with given name
     * @param name of Student
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * @return Student name
     */
    public String getName() {
        return name;
    }

}
