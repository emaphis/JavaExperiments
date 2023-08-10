/**
 * Test the instanceof operator
 * Defines a parent class (named Parent), a simple interface (named MyInterface),
 * and a child class (named Child) that inherits from the parent and implements
 * the interface.
 * @author emaph
 */
class InstanceDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instance of Parent: "
            + (obj1 instanceof Parent));

        System.out.println("obj1 instance of Child: "
            + (obj1 instanceof Child));

        System.out.println("obj1 instance of MyInterface: "
            + (obj1 instanceof MyInterface));

        System.out.println("obj2 instance of Parent: "
            + (obj2 instanceof Parent));

        System.out.println("obj2 instance of Child: "
            + (obj2 instanceof Child));

        System.out.println("obj2 instance of MyInterface: "
            + (obj2 instanceof MyInterface));
    }
}