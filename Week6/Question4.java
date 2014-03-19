/**
 * Question3 class implements application containing 2 cup dispenser
 */
public class Question4 {
  
  /**
  * Main application
  * 
  * @param args
  */
  public static void main(String[] args) {
    CupDispenser cd1 = new CupDispenser("Location A");
    CupDispenser cd2 = new CupDispenser();

    cd1.setCupsNumber(10);
    cd2.setCupsNumber(20);
    System.out.println("CD1 " + cd1.toString());
    System.out.println("CD2 " + cd2.toString());

    cd1.takeCups(cd2);
    System.out.println("CD1 " + cd1.toString());
    System.out.println("CD2 " + cd2.toString());

    cd1.getOneCup();
    System.out.println("CD1 " + cd1.toString());
  }
}