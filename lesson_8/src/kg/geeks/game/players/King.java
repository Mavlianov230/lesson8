package kg.geeks.game.players;

public class King extends Hero {
    private boolean hasSummonedSaitama = false;

    public King (String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAITAMA_WRATH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean hasSummonedSaitama = false;
        if (!hasSummonedSaitama && Math.random() < 0.1) {
            System.out.println("King has summoned Saitama! The boss is defeated instantly!");
            boss.setHealth(0);
            hasSummonedSaitama = true;
        }
    }

    }

