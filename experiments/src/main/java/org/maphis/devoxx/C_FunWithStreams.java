package org.maphis.devoxx;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaph
 */
public class C_FunWithStreams {

    public static void main(String[] args) {
        var listOf
                = List.of("one", "two", "three", "four", "five");

        var list = new ArrayList<String>();

        var count = listOf.stream()
                .filter(s -> true)
                .map(s -> {
                    list.add(s);
                    return s.toUpperCase();
                })
                .count();
        System.out.println("coutn = " + count);
        System.out.println("list = " + list);

        String ints = """
                      1
                      2
                      3
                      4
                      This isn't a number
                      5
                      """;

        var toList
                = ints.lines()
                        .<Integer>mapMulti((s, stream) -> {
                            try {
                                stream.accept(Integer.valueOf(s));
                            } catch (NumberFormatException e) {
                            }
                        })
                        .toList();
        System.out.println("toList = " + toList);
    }

}
