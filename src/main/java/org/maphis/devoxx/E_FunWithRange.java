
package org.maphis.devoxx;

import java.util.Iterator;

/**
 *
 * @author emaph
 */
public class E_FunWithRange {

    public static void main(String[] args) {

        record Range(int begin, int end) implements Iterable<Integer> {

            Range {
                if (begin > end)
                    throw new IllegalArgumentException("begin should be less than end");
            }

            public Range () {
                this(0, 0);
            }

            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int index = begin;
                    @Override
                    public boolean hasNext() {
                       return index < end;
                    }

                    @Override
                    public Integer next() {
                       return index++;
                    }
                };
            }

        }

        var range = new Range(0, 5);

        System.out.println("range = " + range);

        for (Integer index : range) {
            System.out.println("index = " + index);
        }
    }
}
