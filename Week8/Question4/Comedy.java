public class Comedy extends Movie {

  public Comedy(Rating rating, String id, String title) {
    super(rating, id, title);
  }

  @Override public int calculateFees(int days) {
    return days * 6;
  }

}