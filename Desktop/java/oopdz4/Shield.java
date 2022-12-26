public abstract class Shield implements Protection {
    @Override
    public String toString() {
        return String.format("Поглащает урон: %d", damageAbsorption());
    }
}
