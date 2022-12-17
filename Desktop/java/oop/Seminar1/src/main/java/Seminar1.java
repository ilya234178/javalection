import java.util.ArrayList;
import java.util.List;

public class Seminar1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.4);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovars = new ArrayList<>();
        tovars.add(water);
        tovars.add(new Product("vine", 12));
        tovars.add(new Product("dust", 10));
        tovars.add(new Soda("kind", 19, "grapes"));
        tovars.add(new Chocolate("step", 29, "white", 20));



        VendingMachine mach2 = new VendingMachine(tovars);
        System.out.println(mach2);

        System.out.println(mach2.findByName("kind"));
        System.out.println(mach2.findByPrice(12));
        System.out.println(mach2.findByPriceRange(9, 13));
        System.out.println(mach2.findByName("step"));
    }
}
