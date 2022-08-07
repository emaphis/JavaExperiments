
package org.maphis.devoxx.model;

/**
 *
 * @author emaph
 */
public final class Rectangle implements Shape {
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }



    public int height() {
        return height;
    }

    public int width() {
        return width;
    }


}
