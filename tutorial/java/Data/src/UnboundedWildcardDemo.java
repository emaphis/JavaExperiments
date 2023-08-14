
import java.util.Arrays;
import java.util.List;



/**
 * unbounded Wildcards
 * @author emaph
 */
public class UnboundedWildcardDemo {

    //public static void printList(List<Object> list) {  // doesn't compile
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 2);
        List<String> ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);

    }
}

