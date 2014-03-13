import java.util.Scanner;
import java.util.Random;

/**
 * Mastermind class implements game called Mastermind
 */
class Mastermind {

  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Welcome to Mastermind");
    game();
  }

  public static void game() {
    Scanner scan = new Scanner(System.in);
    // Randomized & Start
    Random rand = new Random(System.currentTimeMillis());
    int[] number = new int[4];
    int inplace = 0;
    int outplace = 0;

    for (int i = 0; i < 4; i++) {
      number[i] = rand.nextInt(9);
      //System.out.println(number[i]); 
    } 

    // Guess
    do {
      System.out.print("Guess a number [0000-9999]: ");
      String guess = scan.next();
      inplace = 0;
      outplace = 0;
      for (int i = 0; i < 4; i++) {
        int digit = Character.getNumericValue(guess.charAt(i));
        if (digit == number[i]) inplace++;
        for (int x = 0; x < 4; x++) {
          if (digit == number[x] && x != i) outplace++;
        }
      }
      System.out.println("Correct place: " + inplace);
      System.out.println("Wrong place: " + outplace);
    } while (inplace != 4);
    System.out.println("You won!");
  }
}