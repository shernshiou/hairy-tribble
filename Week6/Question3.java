/**
 * Question3 class implements application containing 3 frogs
 */
public class Question3 {
  
  /**
  * Main application
  * 
  * @param args
  */
  public static void main(String[] args) {
    Frog kermit = new Frog("Kermit");
    Frog legs = new Frog("Legs");
    Frog frogger = new Frog("Frogger");

    // Kermit
    kermit.setLeap(5);
    System.out.println(kermit.toString());
    kermit.jump();
    kermit.jump();
    kermit.jump();
    System.out.println(kermit.toString());

    // Legs
    System.out.println(legs.toString());

    // Frogger
    frogger.jump();
    frogger.jump();
    frogger.jump();
    System.out.println(frogger.toString());
  }
}