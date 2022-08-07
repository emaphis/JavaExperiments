package org.maphis.devoxx;

/**
 *
 * @author emaph
 */
public class D_FunWithSwitchExpression {

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        DayOfWeek dayOfWeek = DayOfWeek.valueOf("TUESDAY");

        var message =
            switch (dayOfWeek) {
            case MONDAY, TUESDAY, THURSDAY, FRIDAY ->
               "School";
            case WEDNESDAY ->
                "Sports";
            case SATURDAY ->
                "Friends";
            case SUNDAY ->
                "Family";
        };
        System.out.println("message = " + message);
    }
}
