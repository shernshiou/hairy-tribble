import java.util.Scanner;

/**
 * Five class implements application to split input integer
 */
class Five {

  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter five-digit integer: ");
    split(scan.nextInt());
  }

  /**
   * Split the input number into 5 segments
   * 
   * @param input Integer to be splitted
   */
  public static void split(int input) {
    int[] result = {0, 0, 0, 0, 0};
    System.out.printf("Digits in %d are ", input);
    System.out.printf("%d %d %d %d %d\n"
      , input/10000, input/1000%10, input/100%10, input/10%10, input%10);
  }
}