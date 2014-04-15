public class Pizza {
  private String size;
  private int cheese;
  private int pepperoni;
  private int ham;

  public Pizza(String size, int cheese, int pepperoni, int ham) {
    this.size = size;
    this.cheese = cheese;
    this.pepperoni = pepperoni;
    this.ham = ham;
  }

  public String getSize() {
    return this.size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public int getCheese() {
    return this.cheese;
  }

  public void setCheese(int cheese) {
    this.cheese = cheese;
  }

  public int getPepperoni() {
    return this.pepperoni;
  }

  public void setPepperoni(int pepperoni) {
    this.pepperoni = pepperoni;
  }

  public int getHam() {
    return this.ham;
  }

  public void setHam(int ham) {
    this.ham = ham;
  }

  public double calcCost() {
    double total = 0;
    if (this.size == "Small") {
      total += 10;
    } else if (this.size == "Medium") {
      total += 12;
    } else if (this.size == "Large") {
      total += 14;
    }

    total += 2 * (cheese + pepperoni + ham);
    return total;
  }

  public String desc() {
    String description = "Size: " + this.size + "\n";
    description += "Cheese: " + this.cheese + "\n";
    description += "Pepperoni: " + this.pepperoni + "\n";
    description += "Ham: " + this.ham + "\n";
    description += "Cost: RM" + this.calcCost();
    return description;
  }
}