public class Question1 {
  public static void main(String[] args) {
    CashPayment cash1 = new CashPayment();
    CashPayment cash2 = new CashPayment(28.30);
    CreditCardPayment creditCard1 = new CreditCardPayment("Ethelyn Debusk", "4111111111111111", "2014-04-21");
    CreditCardPayment creditCard2 = new CreditCardPayment("Kurtis Vidaurri", "4012888888881881", "2014-09-05", 999.02);

    System.out.println(cash1.paymentDetails());
    System.out.println(cash2.paymentDetails());
    System.out.println(creditCard1.paymentDetails());
    System.out.println(creditCard2.paymentDetails());
  }
}