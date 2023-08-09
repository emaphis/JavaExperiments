
package org.maphis.devoxx;

import org.maphis.devoxx.model.Rectangle;
import org.maphis.devoxx.model.Shape;
import org.maphis.devoxx.model.Square;
import org.maphis.devoxx.model.Circle;

/**
 *
 * @author emaph
 */
public class I_SealedTypes {

    public static void main(String[] args) {
        var shape = new Square(4);
        int area = surface(shape);
        System.out.println("area = " + area);
    }

    public static int surface(Shape shape) {

        int surface = switch (shape) {
            case null -> 0;
            case Square square ->
                square.edge() * square.edge();
            case Rectangle rectangle ->
                rectangle.height() * rectangle.width();
            case Circle circle ->
                2 * circle.radius() * circle.radius();
        };
        return surface;
    }
}
