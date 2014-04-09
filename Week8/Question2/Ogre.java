public class Ogre extends Alien {

  public Ogre(int health, String name) {
    super(health, name);
  }  

  public int getAlienType() {
    return Alien.OGRE_ALIEN;
  }

  public int getDamage() {
    return 6;
  }
}