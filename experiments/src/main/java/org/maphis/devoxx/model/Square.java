
package org.maphis.devoxx.model;

/**
 *
 * @author emaph
 */
public final class Square implements Shape {
    private final int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    public int edge() {
        return edge;
    }


}
