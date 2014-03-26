public class Truck extends Vehicle {
  private double load;
  private int towing;

  public Truck() {
    super();
    this.load = 0;
    this.towing = 0;
  }

  public Truck(String manufacturer, int cylinder, double load, int towing, Person owner) {
    this.manufacturer = manufacturer;
    this.cylinder = cylinder;
    this.load = load;
    this.towing = towing;
    this.owner = owner;
  }

  public double getLoad() {
    return this.load;
  }

  public void setLoad(double load) {
    this.load = load;
  } 

  public int getTowing() {
    return this.towing;
  }

  public void setTowing(int towing) {
    this.towing = towing;
  }

  @Override public String toString()
  {
    return String.format(
      "Manufacturer: %s \nCylinder: %s \nLoad: %.2f tonnes \nTowing: RM%d \nOwner: %s \n"
      , this.manufacturer, this.cylinder, this.load, this.towing, this.owner.getName());
  }
}