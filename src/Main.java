public class Main {
    public static void main(String[] args){
        Weapon weapon = new Weapon(WeaponType.SHOTGUN, "Nova");
        Boss boss = new Boss("Darth Vader", 1000, 100, weapon);
        System.out.println("Name: " + boss.getName());
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Weapon type: " + boss.getWeapon().getType());
        System.out.println("Weapon name: " + boss.getWeapon().getName());
        System.out.println(boss.printInfo());
        Skeleton skeleton1 = new Skeleton("Skeletor", 500, 20, new Weapon(WeaponType.RIFLE, "Grizzly "), 10);
    }

}