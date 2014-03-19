/**
 * Frog class implements Frog with name and leap
 */
public class Frog {
  private int leap;
  private String name;

  /**
   * Constructor
   */
  public Frog() {
    leap = 0;
    this.name = "No name";
  }

  /**
   * Constructor
   * 
   * @param  name Frog's name
   */
  public Frog(String name) {
    leap = 0;
    this.name = name;
  }

  /**
   * Set frog name
   * @param name frog's name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get frog name
   * @return Frog's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Set number of leaps
   * @param leap Number of leaps
   */
  public void setLeap(int leap) {
    this.leap = leap;
  }

  /**
   * Get number of leaps
   * @return Number of leaps
   */
  public int getLeap() {
    return this.leap;
  }

  /**
   * Increase leap by 1
   */
  public void jump() {
    ++leap;
  }

  /**
   * Describes current frog
   * @return Description of the frog
   */
  @Override public String toString() {
    return this.name + " has leapt " + this.leap + " times.";
  }
}