/**
 * PrintTriangleTypeMain class implements application that 
 * determines the triangle types
 */
class PrintTriangleTypeMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    try {
      printTriangleType(5, 7, 7);
      printTriangleType(6, 6, 6);
      printTriangleType(5, 7, 8);
      printTriangleType(2, 18, 2);
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Determine whether the triangle is either Equilateral, Isosceles or Scalene
   * 
   * @param  a Length of the one side of triangle
   * @param  b Length of the one side of triangle
   * @param  c Length of the one side of triangle
   * @throws IllegalArgumentException Throws when the sides are invalid.
   */
  public static void printTriangleType(int a, int b, int c) throws IllegalArgumentException {
    int max = Math.max(Math.max(a, b), c);
    if(((a+b+c) - max) < max) {
      throw new IllegalArgumentException(max + " is longer than the sum of the other two.");
    }

    if(a == b && b == c) {
      System.out.println("Equilateral");
    } else if(a == b || b == c || c == a) {
      System.out.println("Isosceles");
    } else {
      System.out.println("Scalene");
    }
  }
}