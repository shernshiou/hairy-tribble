public class Question3 {
  public static void main(String[] args) {
    Temperature temp1 = new Temperature();
    Temperature temp2 = new Temperature(32, 'C');
    Temperature temp3 = new Temperature(-40, 'C');
    Temperature temp4 = new Temperature(-40, 'F');
    Temperature temp5 = new Temperature(100, 'C');
    Temperature temp6 = new Temperature(212, 'F');

    System.out.println(temp1.equals(temp2));
    System.out.println(temp3.equals(temp4));
    System.out.println(temp5.equals(temp6));
  }
}