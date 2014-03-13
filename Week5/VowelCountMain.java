import java.util.Scanner;

class VowelCountMain {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a sentence:");
    String sentence = scan.next();
    if (sentence.length() > 80) {
        sentence = sentence.substring(0, 80);
    }
    int[] result = vowelCount(sentence);
    System.out.println("A: " + result[0]);
    System.out.println("E: " + result[1]);
    System.out.println("I: " + result[2]);
    System.out.println("O: " + result[3]);
    System.out.println("U: " + result[4]);
  }

  public static int[] vowelCount(String input) {
    int[] counter = new int[5];
    for (int i = 0; i < input.length(); i++) {
      switch(input.charAt(i)) {
        case 'A':
        case 'a':
        ++counter[0];
        break;
        case 'E':
        case 'e':
        ++counter[1];
        break;
        case 'I':
        case 'i':
        ++counter[2];
        break;
        case 'O':
        case 'o':
        ++counter[3];
        break;
        case 'U':
        case 'u':
        ++counter[4];
        break;
      }
    }

    return counter;
  }
}