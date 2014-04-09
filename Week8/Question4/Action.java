public class Action extends Movie {

  public Action(Rating rating, String id, String title) {
    super(rating, id, title);
  }

  @Override public int calculateFees(int days) {
    return days * 8;
  }
  
}