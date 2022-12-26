public class Bighield extends Shield {
    @Override
    public int damageAbsorption() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Большой шит поглащает урон: %d", damageAbsorption());
    }
}
