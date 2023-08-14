
import java.util.ArrayList;
import java.util.List;


/**
 * Demo the Box generic type
 * @author emaph
 */
public class BoxDemo {

    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outPutBoxes(List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" +
                    boxContents.toString() + "]");
            counter++;

        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>> lisOfIntegerBoxes = new ArrayList<>();
        BoxDemo.addBox(10, lisOfIntegerBoxes);
        BoxDemo.addBox(20, lisOfIntegerBoxes);
        BoxDemo.addBox(30, lisOfIntegerBoxes);
        BoxDemo.outPutBoxes(lisOfIntegerBoxes);
    }
}
