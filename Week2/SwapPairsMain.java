/**
 * SwapPairsMain class implements application that swap string pairs
 */
class SwapPairsMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(swapPairs("example"));
    System.out.println(swapPairs("hello there"));
  }

  /**
   * Tokenized input into pairs and then swap it
   * 
   * @param  input String to be converted
   * @return The result of swapped pairs
   */
  public static String swapPairs(String input) {
    String result = "";
    for(int i=0; i<input.length(); i+=2) {
      String token = input.substring(i, Math.min(input.length(), i+2));

      if(token.length() == 2) {
        result = result + token.substring(1, 2) + token.substring(0, 1);
      } else {
        result = result + token;
      }
    }

    return result;
  }
}