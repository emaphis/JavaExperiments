
package annotations;

/**
 *
 * @author emaph
 */
public class AnnotationApp {
    
    @DemoAnnotation
    public void toogle() {
    }
    
    public Book makeBook() {
        
        @Author(first = "Lokesh", last = "Gupta")
        Book book = new Book();
        
        return book;
    }
    
    @TravelRequest(
        id = 112233,
        synopsis = "Teleport me",
        engineer = "Mr. John Carter0",
        date     = "04/01/3007"
    )
    public static void sendMeToMars() {
        
    }
    
    public static void main(String[] args) {
        
    }
}
