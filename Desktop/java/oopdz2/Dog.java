public class Dog extends Animal implements Speakable, Runable, SwimmingSpeedable {
    public Dog(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public String speak() {
        return "Wow";
    }

    @Override
    public Integer runSpeed() {
        return 30;
    }

    @Override
    public Integer swimmingSpeed() {
        return 2;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}
