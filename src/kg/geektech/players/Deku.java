package kg.geektech.players;

        import kg.geekthech.generate.RPG_Game;

        import java.util.Random;

public class Deku extends Hero {
    private int var;

    public Deku(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.INCREASE_STRENGTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int vor = RPG_Game.random.nextInt( 2) + 1;
       // if (heroes[7].getHealth() > 0 ) {
            int var = this.getDamage() + boss.getDamage() /8;
        boss.setHealth(boss.getHealth() - this.getDamage() * vor * var);
            System.out.println("Deku INСREASE: " + this.getDamage() * vor * var);
            //  }
            //   int vor = RPG_Game.random.nextInt(50) + 20 + 30;
            //  boss.setHealth(boss.getHealth() - this.getDamage() * vor);
            //  System.out.println("Deku INCREASE: " + this.getDamage() * vor);
        }

    }
//}
