package studentinfo;


/**
 * Represents an individual Student in the system.
 * @author emaph
 */
class Student {
    private final String name;

    /**
     * Create a Student with given name
     * @param name of Student
     */
    Student(String name) {
        this.name = name;
    }

    /**
     * @return Student name
     */
    String getName() {
        return name;
    }

}
