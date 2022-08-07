
package org.maphis.devoxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author emaph
 */
public class B_FunWithLists {

    public static void main(String[] args) {

        var arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add(null);  // can add null

        var arrayAsList =
                Arrays.asList("one", "two", "three","four", "five");
        //arrayAsList.add("six");  // cant add to immutable list
        // -- Exception in thread "main" java.lang.UnsupportedOperationException
        arrayAsList.replaceAll(String::toUpperCase);

        var listOf =
                List.of("ont", "two", "three", "four", "five");

        System.out.println("arrayList   = " + arrayList);
        System.out.println("arrayAsList = " + arrayAsList);
        System.out.println("listOf      = " + listOf);

        arrayList.removeIf(Objects::isNull);
        var copyOf = List.copyOf(arrayList);
        System.out.println("copyOf      = " + copyOf);
        System.out.println("Equals = " + (arrayList == copyOf));

        var copyOf2 = List.copyOf(listOf);
        System.out.println("Equals = " + (copyOf2 == listOf));

        var mapOf = Map.of(1, "1", 2, "2", 3, "3");
        System.out.println("mapOf = " + mapOf);

        var mapOf2 =
                Map.ofEntries(Map.entry(1, "1"),
                        Map.entry(2, "2"),
                        Map.entry(3, "3"));
        System.out.println("mapOf2 = " + mapOf2);
    }
}
