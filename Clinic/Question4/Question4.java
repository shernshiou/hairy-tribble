public class Question4 {
  public static void main(String[] args) {
    Pizza pizza = new Pizza("Large", 1, 0, 1);
    Pizza pizza1 = new Pizza("Medium", 2, 2, 0);
    System.out.println(pizza.desc());

    PizzaOrder order = new PizzaOrder();
    order.setNumPizzas(2);
    order.setPizza1(pizza);
    order.setPizza2(pizza1);
    System.out.println(order.calcTotal());


    PizzaOrder order2 = new PizzaOrder(order);
    order2.getPizza1().setCheese(3);
    double total = order2.calcTotal();
    System.out.println(total);
  }
}