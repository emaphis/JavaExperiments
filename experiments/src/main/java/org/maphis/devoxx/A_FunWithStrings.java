
package org.maphis.devoxx;


public class A_FunWithStrings {
    public static void main(String[] args) {

        String numbers =
                """
                one,    \s
                'two',  \s
                "three",\s
                   four,\s
            five        \s
            """;


        System.out.println("numbers = \n" + numbers);
        numbers.lines()
                .map(line -> "|" + line + "|")
                .forEach(System.out::println);
    }
}
