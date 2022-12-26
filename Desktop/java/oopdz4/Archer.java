public class Archer extends Warrior<Bow, Shield, Armor>{

    public Archer(String name, int healthpoint, Bow bow, Shield shield, Armor armor) {
        super(name, healthpoint, bow, shield, armor);

    }

    @Override
    public String toString() {
        return "Лучник: " + super.toString();
    }
}
