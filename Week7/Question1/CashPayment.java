public class CashPayment extends Payment {
  public CashPayment() {
    super();
  }

  public CashPayment(double amount) {
    super(amount);
  }

  @Override public String paymentDetails() {
    return String.format("The amount is %.2f (cash).\n", this.amount); 
  }
}