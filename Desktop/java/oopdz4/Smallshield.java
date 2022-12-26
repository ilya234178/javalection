public class Smallshield extends Shield {
    @Override
    public int damageAbsorption() {
        return 5;
    }

    @Override
    public String toString() {
        return "Маленький щит: " + super.toString();
    }
}
