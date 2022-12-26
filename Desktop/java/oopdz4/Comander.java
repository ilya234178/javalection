public class Comander extends Warrior<Weapon, Protection, Armor>{
    public Comander(String name, int healthpoint, Weapon weapon, Protection protection, Armor armor) {
        super(name, healthpoint, weapon, protection, armor);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
