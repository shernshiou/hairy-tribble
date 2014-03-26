public class CreditCardPayment extends Payment {
  private String cardName;
  private String cardNumber;
  private String expiration;

  public CreditCardPayment(String cardName, String cardNumber, String expiration) {
    this.cardName = cardName;
    this.cardNumber = cardNumber;
    this.expiration = expiration;
  }

  public CreditCardPayment(String cardName, String cardNumber, String expiration, double amount) {
    super(amount);
    this.cardName = cardName;
    this.cardNumber = cardNumber;
    this.expiration = expiration;
  }

  @Override public String paymentDetails() {
    return String.format(
      "The amount is %.2f (credit card).\n Name: %s \n Number: %s \n Expiration Date: %s \n"
      , this.amount, this.cardName, this.cardNumber, this.expiration); 
  }
}