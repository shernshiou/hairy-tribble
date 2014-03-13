import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class StdDev {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("floatnumbers.txt")))
    {
      double total = 0, avg = 0, stddev = 0;
      ArrayList<Double> numList = new ArrayList<Double>();
      String currentLine;
      while ((currentLine = reader.readLine()) != null) {
        Double num = Double.parseDouble(currentLine);
        numList.add(num);
        total = total + num;
      }
      avg = total / numList.size();
      for (double num : numList) {
        stddev = Math.pow((num - avg), 2);
      }

      System.out.printf("Standard Deviation is %f\n", stddev);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}