public class Question1 {

  public static void main(String[] args) {
    AlienPack pack = new AlienPack(6);

    Marshmallow alien1 = new Marshmallow(100, "m1");
    pack.addAlien(alien1, 0);
    Marshmallow alien2 = new Marshmallow(80, "m2");
    pack.addAlien(alien2, 1);
    Marshmallow alien3 = new Marshmallow(50, "m3");
    pack.addAlien(alien3, 2);

    Ogre ogre1 = new Ogre(100, "o1");
    pack.addAlien(ogre1, 3);
    Ogre ogre2 = new Ogre(29, "o2");
    pack.addAlien(ogre2, 4);

    Snake snake1 = new Snake(10, "s1");
    pack.addAlien(snake1, 5);

    System.out.println("Total damage: " + pack.calculateDamage());
    System.out.println("s1 is a type of " + snake1.getAlienTypeName());
  }

}