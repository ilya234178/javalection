public class Cat extends Animal implements Speakable, Runable, SwimmingSpeedable {
    public Cat(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public String speak() {
        return "May";
    }

    @Override
    public Integer runSpeed() {
        return 50;
    }

    @Override
    public Integer swimmingSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
