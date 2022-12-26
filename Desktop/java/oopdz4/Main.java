public class Main {
    public static void main(String[] args) {
        Comander comander = new Comander("Vasia", 250, new LongBow(), new Bighield(), new Hauberk());
        Team<Archer> archers = new Team<>(comander);
        System.out.println(comander);
        archers.addWarrior(new Archer("Petr", 180, new LongBow(), new Smallshield(), new Hauberk()));
        archers.addWarrior(new Archer("Val", 210, new LongBow(), new Smallshield(), new Hauberk()));
        archers.forEach(item -> System.out.println(item));

        System.out.println("Суммарный урон команды равен: " + archers.getAllDamage() +
                "Суммарное здоровье: " + archers.getAllHealthpoint() +
                "Максимальная зона поражения: " + archers.getMaxRadius()
                + "Максимальная защита: " + archers.getMaxArmor());

        System.out.println("_________________________");

        Comander comander1 = new Comander("SuperVasia", 530, new LongBow(), new Bighield(), new Hauberk());
        Team<Barbarian> axes = new Team<>(comander1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira(), new Bighield(), new Hauberk()));
        System.out.println(comander1);
        for (Barbarian item: axes) {
            System.out.println(item);
        }

        System.out.println("Суммарный урон команды равен: " + axes.getAllDamage() +
                "Суммарное здоровье: " + axes.getAllHealthpoint() +
                "Максимальная зона поражения: " + axes.getMaxRadius()
                + "Максимальная защита: " + axes.getMaxArmor());

        System.out.println("_________________________");

        Comander comander2 = new Comander("Dmitriy", 290, new LongBow(), new Bighield(), new Hauberk());
        Team<Warrior> gang = new Team<>(comander2);
        gang.addWarrior(new Barbarian("John", 325, new Sekira(), new Bighield(), new Hauberk()));
        gang.addWarrior(new Archer("Mayk", 187, new LongBow(), new Smallshield(), new Hauberk()));
        System.out.println(comander2);
        gang.forEach(item -> System.out.println(item));

        System.out.println("Суммарный урон команды равен: " + gang.getAllDamage() +
                "Суммарное здоровье: " + gang.getAllHealthpoint() +
                "Максимальная зона поражения: " + gang.getMaxRadius()
                + "Максимальная защита: " + gang.getMaxArmor());

    }

}
