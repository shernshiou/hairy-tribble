import java.util.BitSet;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hangman class implements game called Hangman
 */
class Hangman {

  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("Welcome to Hangman");
    game();
  }

  /**
   * Hangman game
   * 
   * @param scan Scanner object to get user input
   */
  public static void game() {
    Scanner scan = new Scanner(System.in);
    // Load dictionary
    String[] wordsDict = new String[718];
    try (BufferedReader reader = new BufferedReader(new FileReader("words.dat")))
    {
      String currentLine;
      int line = 0;
      while ((currentLine = reader.readLine()) != null) {
        wordsDict[line] = currentLine;
        ++line;
      } 
    } catch (IOException e) {
      e.printStackTrace();
    } 

    // Randomized & Start
    Random rand = new Random(System.currentTimeMillis());
    String word = wordsDict[rand.nextInt(50)];
    BitSet mask = new BitSet(word.length());
    int chance = 12;

    // Guess
    do {
      clue(word, mask);
      System.out.print("[" + chance + "] Guess a character: ");
      char guess = scan.next().charAt(0);
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == guess) {
          mask.set(i);
        }
      }
      --chance;
    } while (chance > 0 && mask.cardinality() < word.length());
    System.out.println("You won!");
  }

  /**
   * Print out clue
   * 
   * @param word Original answer
   * @param mask Masked answer
   */
  public static void clue(String word, BitSet mask) {
    for (int i = 0; i < word.length(); i++) {
      if (mask.get(i)) {
        System.out.print(word.charAt(i));
      } else {
        System.out.print("*");
      }
    }
    System.out.print("\n");
  }
}