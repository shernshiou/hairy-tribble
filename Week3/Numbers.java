/**
 * Calculations class implements application to calculate 
 * square and cube from 0 - 10
 */
class Numbers {

  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("number\tsquare\tcube");
    for (int i=0; i<=10; i++) {
      calculate(i);
    }
  }

  /**
   * Print out square and cube
   * 
   * @param number Given number
   */
  public static void calculate(int number) {
    System.out.printf("%d\t%d\t%d\n", number, number*number, number*number*number);
  }
}