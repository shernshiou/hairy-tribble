public class PizzaOrder {
  private Pizza[] order;

  public PizzaOrder() {

  }

  // Copy constructor
  public PizzaOrder(PizzaOrder order) {
    this.order = new Pizza[order.getNumPizzas()];
    if (order.getNumPizzas() > 0)
      this.order[0] = order.getPizza1();
    if (order.getNumPizzas() > 1)
      this.order[1] = order.getPizza2();
    if (order.getNumPizzas() > 2)
      this.order[2] = order.getPizza3();
  }

  public void setNumPizzas(int numPizzas) {
    order = new Pizza[numPizzas];
  }

  public void setPizza1(Pizza pizza1) {
    order[0] = pizza1;
  }

  public void setPizza2(Pizza pizza2) {
    order[1] = pizza2;
  }

  public void setPizza3(Pizza pizza3) {
    order[2] = pizza3;
  }

  public double calcTotal() {
    double total = 0;
    for (int i = 0; i < order.length; i++) {
      total += order[i].calcCost();
    }

    return total;
  }

  public int getNumPizzas() {
    return order.length;
  }

  public Pizza getPizza1() {
    return order[0];
  }

  public Pizza getPizza2() {
    return order[1];
  }

  public Pizza getPizza3() {
    return order[2];
  }
}