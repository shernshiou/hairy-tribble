/**
 * CollapseMain class implements application that sum up array
 */
class CollapseMain {
  /**
   * Main application
   * 
   * @param args
   */
  public static void main(String[] args) {
    int[] array = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
    int[] result = collapse(array);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

  /**
   * Collapse array of Integers
   *
   * @param input Array of Integers
   * @return Array of collapsed Integers
   */
  public static int[] collapse(int[] input) {
    int length = (input.length % 2 == 0) 
      ? input.length / 2
      : (input.length / 2) + 1;
    int[] collapsed = new int[length];

    int x = 0;
    for (int i = 0; i < input.length; i += 2) {
      collapsed[x] = input[i] + input[i+1];
      x++;
    }
    if (input.length % 2 != 0) {
      collapsed[collapsed.length] = input[input.length];
    }

    return collapsed;
  }
}