public class Ogre extends Alien {

  public Ogre(int health, String name) {
    super(health, name);
    this.type = Alien.OGRE_ALIEN;
    this.damage = 6;
  }  

}