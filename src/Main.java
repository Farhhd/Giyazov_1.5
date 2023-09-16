import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        boss.setDefenceType("Physic");
        boss.setDamage(70);
        boss.setHealth(900);
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Defence type: " + boss.getDefenceType());
    }
}