import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Difference {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a first file name: ");
    String left = scan.next();
    System.out.println("Enter a second file name: ");
    String right = scan.next();

    difference(left, right);
  }

  public static void difference(String left, String right) {
    System.out.println("Differences found:");

    int line = 0;
    BufferedReader leftReader = null;
    BufferedReader rightReader = null;

    try {
      String leftLine;
      String rightLine;
      leftReader = new BufferedReader(new FileReader(left));
      rightReader = new BufferedReader(new FileReader(right));

      while ((leftLine = leftReader.readLine()) != null && (rightLine = rightReader.readLine()) != null) {
        ++line;
        if (!leftLine.equals(rightLine)) {
          System.out.printf("Line %d:\n", line);
          System.out.println("< " + leftLine);
          System.out.println("> " + rightLine + "\n");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (leftReader != null) 
          leftReader.close();
        if (rightReader != null)
          rightReader.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}