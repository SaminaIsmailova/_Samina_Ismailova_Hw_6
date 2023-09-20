public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(100, 50, new Weapon(WeaponType.SWORD, "name"));
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton(100, 40, new Weapon(WeaponType.BOW, "name"), 15);
        Skeleton skeleton2 = new Skeleton(100, 40, new Weapon(WeaponType.BOW, "name"), 15);
        skeleton.printInfo();
        skeleton2.printInfo();

    }
}