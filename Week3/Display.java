/**
 * Display class implements application that find value of character
 */
class Display {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    String testString = new String("ABCabc012$*+/ ");
    for (int x=0; x<testString.length(); x++) {
      value(testString.charAt(x));
    }
  }

  /**
   * Find the value of input character
   * 
   * @param input Character to be tested
   */
  public static void value(char input) {
    System.out.printf("The character %c has the value %d\n", input, ((int)input));
  }
}