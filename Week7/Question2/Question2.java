public class Question2 {
  public static void main(String[] args) {
    Person john = new Person();
    Person adam = new Person("Adam C. Calloway");

    Vehicle ufo = new Vehicle();
    Truck hilux = new Truck("Toyota", 6, 5.5, 2, adam);

    System.out.println(ufo.toString());
    System.out.println(hilux.toString());
    System.out.println("People comparator: " + john.equals(adam));
    System.out.println("People comparator: " + adam.equals(adam));

  }
}