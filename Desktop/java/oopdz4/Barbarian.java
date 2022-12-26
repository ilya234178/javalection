public class Barbarian extends Warrior<Axe, Shield, Gear>{

    public Barbarian(String name, int healthpoint, Axe weapon, Shield protection, Gear gear) {
        super(name, healthpoint, weapon, protection, gear);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}
