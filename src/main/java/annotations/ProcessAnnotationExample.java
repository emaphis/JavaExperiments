package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 *
 * @author emaph
 */
public class ProcessAnnotationExample {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        new DemoClass();
        Class<DemoClass> demoClassObj = DemoClass.class;
        Method method = demoClassObj.getMethod("getString", new Class[]{});
        readAnnotation(method);
    }

    private static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.println("1\n Finding annotations on " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavaFileInfo) {
                    JavaFileInfo fileInfo = (JavaFileInfo) annotation;
                    System.out.println("Author " + fileInfo.author());
                    System.out.println("Version " + fileInfo.version());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
