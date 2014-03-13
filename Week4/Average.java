import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Average {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("floatnumbers.txt")))
    {
      double total = 0;
      int line = 0;
      String currentLine;
      while ((currentLine = reader.readLine()) != null) {
        ++line;
        total = total + Double.parseDouble(currentLine);
      }
      System.out.printf("Average is %f\n", total/line);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}