/*
 * Now study eccapsulation
 * Acessore and Mutator Methods
 * Immutablility.
 */
package class_features;

/**
 *
 * @author emaphis
 */
public class Employee {
    private final String employeeID;
    private final String firstName;
    private final String lastName;

    public Employee(String id, String first, String last) {
        employeeID = id;
        firstName = first;
        lastName = last;
    }
    
    public int getEmployeeID() {
        return Integer.parseInt(employeeID);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}
