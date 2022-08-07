
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

    }

    public int surface(Shape shape) {

        int surface = switch (shape) {
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
