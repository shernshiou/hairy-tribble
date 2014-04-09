public class Snake extends Alien {

  public Snake(int health, String name) {
    super(health, name);
  }  

  public int getAlienType() {
    return Alien.SNAKE_ALIEN;
  }

  public int getDamage() {
    return 10;
  }
}