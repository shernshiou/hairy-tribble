public class Temperature {
  private float num;
  private char symbol;

  public Temperature() {
    this.num = 0;
    this.num = 'C';
  }

  public Temperature(float num) {
    this.num = num;
    this.symbol = 'C';
  }

  public Temperature(char symbol) {
    this.num = 0;
    this.symbol = symbol;
  }

  public Temperature(float num, char symbol) {
    this.num = num;
    this.symbol = symbol;
  }

  public float getValue() {
    return this.num;
  }

  public char getSymbol() {
    return this.symbol;
  }

  public float celcius() {
    return 5 * (num - 32) / 9;
  }

  public float fahrenheit() {
    return (9 * (num / 5)) + 32;
  }

  public void setValue(float num) {
    this.num = num;
  }

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  @Override public boolean equals(Object obj) {
    Temperature temp = (Temperature)obj;
    float celcius1, celcius2;
    if (this.symbol != 'C') {
      celcius1 = this.celcius();
    } else {
      celcius1 = this.getValue();
    }

    if (temp.symbol != 'C') {
      celcius2 = temp.celcius();
    } else {
      celcius2 = temp.getValue();
    }

    return (celcius1 == celcius2);
  }

  @Override public String toString() {
    return this.num + " " + this.symbol;
  }
}