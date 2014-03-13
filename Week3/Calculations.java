import java.util.Scanner;

/**
 * Calculations class implements application to calculate min max sum and average
 */
class Calculations {

  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int a = scan.nextInt();
    System.out.println("Enter second integer: ");
    int b = scan.nextInt();
    System.out.println("Enter third integer: ");
    int c = scan.nextInt();

    calculate(a, b, c);
  }
  
  /**
   * Calculate min, max, sum and average
   * 
   * @param a Input 1
   * @param b Input 2
   * @param c Input 3
   */
  public static void calculate(int a, int b, int c) {
    int largest = Math.max(a, Math.max(b, c));
    int smallest = Math.min(a, Math.min(b, c));
    int sum = a + b + c;
    int prod = a * b * c;
    double avg = sum / 3;

    System.out.printf("For the numbers %d, %d and %d\n", a, b, c);
    System.out.printf("Largest is %d\n", largest);
    System.out.printf("Smallest is %d\n", smallest);
    System.out.printf("Sum is %d\n", sum);
    System.out.printf("Average is %.2f\n", avg);
  }
}