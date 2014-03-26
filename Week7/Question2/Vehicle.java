public class Vehicle {
  protected String manufacturer;
  protected int cylinder;
  protected Person owner;

  public Vehicle() {
    this.manufacturer = "Unknown";
    this.cylinder = 99999;
    this.owner = new Person();
  }

  public Vehicle(String manufacturer, int cylinder, Person owner) {
    this.manufacturer = manufacturer;
    this.cylinder = cylinder;
    this.owner = owner;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getCylinder() {
    return this.cylinder;
  }

  public void setCylinder(int cylinder) {
    this.cylinder = cylinder;
  }

  public Person getOwner() {
    return this.owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  @Override public String toString()
  {
    return String.format(
      "Manufacturer: %s \nCylinder: %s \nOwner: %s \n"
      , this.manufacturer, this.cylinder, this.owner.getName());
  }
}