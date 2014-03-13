/**
 * VerticalMain class implements application that print string vertically
 */
class VerticalMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    vertical("object oriented"); 
  }

  /**
   * Print horizontal text vertically
   * @param horizontal input to be printed
   */
  public static void vertical(String horizontal) {
    for (int x=0; x<horizontal.length(); x++) {
      System.out.println(horizontal.charAt(x));
    }
  }
}