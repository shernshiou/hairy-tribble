/**
 * CupDispenser class implements normal cup dispenser logic
 */
public class CupDispenser {
  private String location;
  private int cups;

  /**
   * Constructor
   */
  public CupDispenser() {
    this.location = "Unknown";
    cups = 0;
  }

  /**
   * Constructor
   * 
   * @param  location Location of the cup dispenser
   */
  public CupDispenser(String location) {
    this.location = location;
    cups = 0;
  }

  /**
   * Set location of cup dispenser
   * @param location Location of the cup dispenser
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Get the location of the cup dispenser
   * @return Location of the cup dispenser
   */
  public String getLocation() {
    return this.location;
  }

  /**
   * Set the number of cups inside cup dispenser
   * @param cups Number of cups
   */
  public void setCupsNumber(int cups) {
    this.cups = cups;
  }

  /**
   * Get the number of cups inside cup dispenser
   * @return Number of cups
   */
  public int getCupsNumber() {
    return cups;
  }

  /**
   * Take away 1 cup
   */
  public void getOneCup() {
    --cups;
  }

  /**
   * Take the from other cup dispenser
   * @param other Other cup dispenser
   */
  public void takeCups(CupDispenser other) {
    this.cups = this.cups + other.getCupsNumber();
    other.setCupsNumber(0);
  }

  /**
   * Descriptions of the cup dispenser
   * @return Number of cups in the cup dispenser
   */
  @Override public String toString() {
    return "contain " + cups + " cups.";
  }
}