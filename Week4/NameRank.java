import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NameRank {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a name: ");
    String name = scan.next();
    search(name, "boynames.txt");
    search(name, "girlnames.txt");
  }

  public static void search(String name, String filename) {
    String type = "boy";
    if (filename == "girlnames.txt") {
      type = "girl";
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
    {
      String currentLine;
      boolean found = false;
      int ranking = 0;
      while ((currentLine = reader.readLine()) != null) {
        ++ranking;
        String[] parts = currentLine.split(" ");
        if (parts[0].trim().toLowerCase().equals(name.toLowerCase())) {
          found = true;
          System.out.printf("%s is ranked %d in popularity among %ss with %s namings.\n"
            , parts[0], ranking, type, parts[1]);
        }
      }

      if (!found) {
        System.out.printf("%s is not ranked amont the top 1000 %s names.\n", name, type);
      }
 
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}