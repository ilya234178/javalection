public abstract class Animal {
    private String nickname;
    private int lags;
    private String owner;

    public String getNickname() {
        return nickname;
    }

    public int getLags() {
        return lags;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String nickname, int lags, String owner) {
        this.nickname = nickname;
        this.lags = lags;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "nickname='" + nickname + '\'' +
                ", lags=" + lags +
                ", owner='" + owner + '\'' +
                '}';
    }

}
