public class Chocolate extends Product{
    public Chocolate(String name, double price, String flavor, double countSlice) {
        super(name, price);
        this.setFlavor(flavor);
        this.countSlice = countSlice;
    }
    private String flavor;

    public double getCountSlice() {
        return countSlice;
    }

    public void setCountSlice(int countSlice) {
        this.countSlice = countSlice;
    }

    private double countSlice;

    public String getFlavor() {
        return flavor;
    }

    private void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String toString(){
        return String.format("%s - %s - %.2f", super.toString(),flavor, countSlice);
    }

}
