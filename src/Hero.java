public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superPower;

    public Hero(int health, int damage, String superPower) {
        this.heroDamage = damage;
        this.heroDamage = health;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.heroDamage = damage;
        this.heroHealth = health;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getDamage() {
        return heroDamage;
    }

    public int getHealth() {
        return heroHealth;
    }
}
