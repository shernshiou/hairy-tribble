public class Question3 {

  public static void main(String[] args) {
    Action flightoffury = new Action(Movie.Rating.R, "1", "Flight of Fury");  
    Comedy frozen = new Comedy(Movie.Rating.G, "2", "Frozen");
    Drama fightclub = new Drama(Movie.Rating.PG13, "3", "Fight Club");

    System.out.println( frozen.title + " (10 days) late fees: " + frozen.calculateFees(10) );
    System.out.println( fightclub.title + " (5 days) late fees: " + fightclub.calculateFees(5) );
  }

}