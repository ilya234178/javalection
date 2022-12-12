package dz5;
import java.util.HashMap;
import java.util.Map;

public class Tsk2 {
    public static void main(String[] args) {
        Map<Integer, String> sr = new HashMap<>();

        sr.put(0, "RED");
        sr.put(1, "GREEN");
        sr.put(2, "GREY");
        sr.forEach((k, v) -> sr.compute(k, (c, r) -> (r = r +"!")));
        System.out.println(sr);
    }
}
