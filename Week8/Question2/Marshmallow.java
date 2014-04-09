public class Marshmallow extends Alien {

  public Marshmallow(int health, String name) {
    super(health, name);
  }  

  public int getAlienType() {
    return Alien.MARSHMALLOW_MAN_ALIEN;
  }

  public int getDamage() {
    return 1;
  }
}