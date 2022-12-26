public abstract class Warrior<T extends Weapon, S extends Protection, A extends Armor> {
    private String name;
    private int healthpoint;
    private T weapon;

    private S protection;

    private A armor;




    public Warrior(String name, int healthpoint, T weapon, S protection, A armor) {
        this.name = name;
        this.healthpoint = healthpoint;
        this.weapon = weapon;
        this.protection = protection;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("name: %s, здоровье: %d, вооружен: %s, щит: %s, доспехи: %s", name, healthpoint, weapon.toString(), protection.toString(), armor.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthpoint() {
        return healthpoint;
    }

    public void setHealthpoint(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public S getProtection() {
        return protection;
    }

    public void setProtection(S protection) {
        this.protection = protection;
    }

    public A getArmor() {
        return armor;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }

}
