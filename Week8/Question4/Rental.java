public class Rental {

  private Movie movie;
  private String customer;
  private int late;

  public Rental(Movie movie, String customer) {
    this.movie = movie;
    this.customer = customer;
  }

  public void setLate(int days) {
    this.late = days;
  }

  public int calculateFees() {
    return movie.calculateFees(this.late);
  }
}