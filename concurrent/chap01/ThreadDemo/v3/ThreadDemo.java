
import java.math.BigDecimal;

/**
 * Listing 1-3. Demonstrating Thread Joining
 * @author emaph
 */
public class ThreadDemo {

    // constant used during pi computation
    private static final BigDecimal FOUR = BigDecimal.valueOf(4);
    // rounding mode to use during pi computation
    private static final int ROUNDINGMODE = BigDecimal.ROUND_HALF_EVEN;
    private static BigDecimal result;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Runnable r = () -> { result = computePi(50000); };

        Thread t = new Thread(r);
        t.start();

        try {
            t.join();
        } catch (InterruptedException ie) {
            // Should never arrive here because interrupt() is never
            // called.
        }
        System.out.println("Result = " + result);
    }

    /*
     * Compute the value of pi to the specified number of digits after the
     * decimal point. The value is computed using Machin's formula:
     *
     * pi/4 = 4*arctan(1/5)-arctan(1/239)
     *
     * and a power series expansion of arctan(x) to sufficient precision.
     */
    public static BigDecimal computePi(int digits) {
        int scale = digits + 5;
        BigDecimal arctan1_5 = arctan(5, scale);
        BigDecimal arctan1_239 = arctan(239, scale);
        BigDecimal pi = arctan1_5.multiply(FOUR).
        subtract(arctan1_239).multiply(FOUR);
        return pi.setScale(digits, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal arctan(int inverseX, int scale) {
       BigDecimal result, numer, term;
       BigDecimal invX = BigDecimal.valueOf(inverseX);
       BigDecimal invX2 = BigDecimal.valueOf(inverseX * inverseX);
       numer = BigDecimal.ONE.divide(invX, scale, ROUNDINGMODE);
       result = numer;
       int i = 1;
       do {
          numer = numer.divide(invX2, scale, ROUNDINGMODE);
          int denom = 2 * i + 1;
          term = numer.divide(BigDecimal.valueOf(denom), scale,
                              ROUNDINGMODE);
          if ((i % 2) != 0)
             result = result.subtract(term);
          else
             result = result.add(term);
          i++;
       } while (term.compareTo(BigDecimal.ZERO) != 0);

       return result;
    }
}
