import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MinMax {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt")))
    {
      int min = 0, max = 0, line = 0;
      String currentLine;
      while ((currentLine = reader.readLine()) != null) {
        int num = Integer.parseInt(currentLine);
        if (line == 0) {
          min = num;
          max = num;
        } else {
          if (num < min) min = num;
          if (num > max) max = num;
        }
        ++line;
      }
      System.out.printf("Smallest number is %d\nLargest number is %d\n", min, max);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}