package annotations;

/**
 *
 * @author emaph
 */
public @interface TravelRequest {
    int id();
    String synopsis();
    String engineer() default "[unassigned]";
    String date() default "[unimplemented]";
}
