public class Hauberk extends Gear {
    @Override
    public int armoring() {
        return 30;
    }

    @Override
    public String toString() {
        return "Кольчуга защищает" + super.toString();
    }
}
