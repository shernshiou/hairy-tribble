public class Question4 {

  public static void main(String[] args) {
    Action flightoffury = new Action(Movie.Rating.R, "1", "Flight of Fury");  
    Comedy frozen = new Comedy(Movie.Rating.G, "2", "Frozen");
    Drama fightclub = new Drama(Movie.Rating.PG13, "3", "Fight Club");

    Rental[] rentals = new Rental[3];
    rentals[0] = new Rental(flightoffury, "CUS20202");
    rentals[0].setLate(10);
    rentals[1] = new Rental(frozen, "CUS20sjj");
    rentals[0].setLate(5);
    rentals[2] = new Rental(fightclub, "CUS2982");
    rentals[0].setLate(8);

    System.out.println("Total late fees: RM" + lateFeesOwed(rentals));
  }

  public static int lateFeesOwed(Rental[] rentals) {
    int total = 0;
    for (int i = 0; i < rentals.length; i++) {
      total += rentals[i].calculateFees();
    }

    return total;
  }

}