public abstract class Movie {

  public enum Rating { 
    G, 
    PG13, 
    R 
  }

  protected Rating rating;
  protected String id;
  public String title;

  public Movie(Rating rating, String id, String title) {
    this.rating = rating;
    this.id = id;
    this.title = title;
  }

  public int calculateFees(int days) {
    return days * 10;
  }

  @Override public boolean equals(Object other){
    Movie compare = (Movie)other;
    return ( this.id == compare.id );
  }
}