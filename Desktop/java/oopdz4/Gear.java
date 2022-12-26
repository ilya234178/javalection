public abstract class Gear implements Armor {

    @Override
    public String toString() {
        return String.format("Дает защиту: %d", armoring());
    }
}
