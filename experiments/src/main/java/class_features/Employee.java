/*
 * Now study eccapsulation
 * Acessore and Mutator Methods
 * Immutablility.
 * Clone ablitity
 * implement equals
 */
package class_features;

/**
 *
 * @author emaphis
 */
public class Employee implements Cloneable {
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
    
    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj instanceof Employee)) {
            Employee emp = (Employee) obj;
            if (this.employeeID.equals(emp.employeeID)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(employeeID);
    }
}