
package org.maphis.devoxx.model;

/**
 *
 * @author emaph
 */
public final class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int radius() {
        return radius;
    }

}
