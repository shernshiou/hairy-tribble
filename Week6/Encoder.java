import java.util.Scanner;

/**
 * Encoder class implements application that uses functions in String class
 */
class Encoder {

  /**
  * Main application
  * 
  * @param args
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String input = scan.nextLine();
    System.out.println(encode(input));
  }

  /**
   * Encodes string
   * 
   * @param  input String to be encoded
   * @return       Encoded result
   */
  public static String encode(String input) {
    String output;
    output = input.replace('A', '@')
      .replace('a', '@')
      .replace('E', '#')
      .replace('e', '#')
      .replace('I', '!')
      .replace('i', '!')
      .replace('O', '&')
      .replace('o', '&')
      .replace('U', '%')
      .replace('u', '%');
    return output;
  }
}