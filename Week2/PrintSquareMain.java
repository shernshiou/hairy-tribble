/**
 * PrintSquareMain class implements application that generates number square
 */
class PrintSquareMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    printSquare(3, 7); 
  }

  /**
   * Method to generate square
   * 
   * @param min Starting value
   * @param max Ending value
   */
  public static void printSquare(int min, int max) {
    if(min > max) {
      min = min ^ max;
      max = min ^ max;
      min = min ^ max;
    }

    String firstRow = "";
    for(int i=0; i <= max-min; i++) {
      firstRow = firstRow + (min + i);
    }

    for(int i=0; i < firstRow.length(); i++) {
      System.out.println(firstRow.substring(i) + firstRow.substring(0, i));
    }
  }
}