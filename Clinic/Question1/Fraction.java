public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator;
  }

  public double fraction() {
    return (double)numerator / (double)denominator;
  }

  public double lowestTerm() {
    int gcd = gcd(numerator, denominator);
    return ((double)numerator / gcd) / ((double)denominator / gcd);
  }

  // Greatest common divisor
  private int gcd(int a, int b) {
    if (a == 0)
        return b;

    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a;
  }
}