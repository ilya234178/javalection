public class Swan extends Animal implements Speakable, Runable, SwimmingSpeedable, Flyable{

    public Swan(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public String speak() {
        return "Yo!";
    }

    @Override
    public Integer swimmingSpeed() {
        return 15;
    }

    @Override
    public int flySpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Swan" + super.toString();
    }
}
