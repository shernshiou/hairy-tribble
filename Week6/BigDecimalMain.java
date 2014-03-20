import java.math.BigDecimal;
import java.util.Scanner;

/**
 * BigDecimalMain class implements application to make use of BigDecimal class
 */
class BigDecimalMain {

  /**
  * Main application
  * 
  * @param args
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your first BigDecimal number: ");
    BigDecimal num1 = new BigDecimal(scan.nextInt());
    System.out.println("Enter your second BigDecimal number: ");
    BigDecimal num2 = new BigDecimal(scan.nextInt());
    calculate(num1, num2);
  }

  /**
   * Common functions in BigDecimal class
   * 
   * @param a First number
   * @param b Second number
   */
  public static void calculate(BigDecimal a, BigDecimal b) {
    System.out.printf("%s + %s = %s \n", a, b, a.add(b));
    System.out.printf("%s - %s = %s \n", a, b, a.subtract(b));
    System.out.printf("%s * %s = %s \n", a, b, a.multiply(b));
    System.out.printf("%s / %s = %s \n", a, b, a.divide(b));
    System.out.printf("%s.toString() is %s \n", a, a.toString());
    System.out.printf("%s.toString() is %s \n", b, b.toString());
    System.out.printf("%s.equals(%s) is %b \n", a, b, a.equals(b));
    System.out.printf("%s.compareTo(%s) is %d \n", a, b, a.compareTo(b));
  }
}