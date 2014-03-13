/**
 * LargestAbsValMain class implements application that find largest absolute value
 */
class LargestAbsValMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(largestAbsVal(7, -2, -11));
    //System.out.println("Largest absolute value for 7, -2, -11: " + largestAbsVal(7, -2, -11)); 
    //System.out.println("Largest absolute value for -4, -5, 2: " + largestAbsVal(-4, -5, 2)); 
  }

  /**
   * Find the largest absolute value out of 3 values
   * @param  a First value
   * @param  b Second value
   * @param  c Third value
   * @return Largest absolute value out of 3 values
   */
  public static int largestAbsVal(int a, int b, int c) {
    a = Math.abs(a);
    b = Math.abs(b);
    c = Math.abs(c);
    int max = Math.max(Math.max(a, b), c); 
    return max;
    //return Math.max(Math.max(Math.abs(a), Math.abs(b)), Math.abs(c));
  }
}