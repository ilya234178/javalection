public class Eagle extends Animal implements Speakable, Runable, Flyable, SwimmingSpeedable {
    public Eagle(String nickname, int lags, String owner) {
        super(nickname, lags, owner);
    }

    @Override
    public int flySpeed() {
        return 100;
    }

    @Override
    public Integer runSpeed() {
        return 1;
    }

    @Override
    public String speak() {
        return "hhhh";
    }

    @Override
    public Integer swimmingSpeed() {
        return 1;
    }

    @Override
    public String toString() {
        return "Eagle" +  super.toString();
    }
}
