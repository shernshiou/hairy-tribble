public class Snake extends Alien {
  public Snake(int health, String name) {
    super(health, name);
    this.type = Alien.SNAKE_ALIEN;
    this.damage = 10;
  }  
}