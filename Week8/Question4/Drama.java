public class Drama extends Movie {

  public Drama(Rating rating, String id, String title) {
    super(rating, id, title);
  }

  @Override public int calculateFees(int days) {
    return days * 4;
  }

}