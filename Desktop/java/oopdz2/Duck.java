public class Duck extends Animal implements Speakable, Runable, SwimmingSpeedable, Flyable {
    public Duck(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public Integer runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Krya";
    }

    @Override
    public Integer swimmingSpeed() {
        return 7;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
