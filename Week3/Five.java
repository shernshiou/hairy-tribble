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

    for (int i=4; i>=0; i--) {
      if(i>0) {
        result[i] = input % 10;
        input = input / 10;
      } else {
        result[i] = input;
      }
    }

    for (int x=0; x<5; x++) {
      System.out.printf("%d ", result[x]);
    }
  }
}