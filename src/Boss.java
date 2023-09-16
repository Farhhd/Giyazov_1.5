public class Boss {
    private String defenceType;
    private int health;
    private int damage;
    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }
}