
/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed.
 * @author emaph
 */
public class Box<T> {
    // T stands for type
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public void inspect() {
        System.out.println("T: " + t.getClass().getName());
       // System.out.println("U: " + u.getClass().getName());
    }
}
