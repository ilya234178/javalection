import java.util.*;

public class Program {

    static Map<Integer, Integer> set = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    static Set<Integer> set2 = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    public static void main(String[] args) {
        methodPut(2);
        methodPut(1);
        methodPut(5);
        methodPut(4);
        System.out.println(set);
        methodPut1(33);
        methodPut1(22);
        methodPut1(55);
        methodPut1(11);
        System.out.println(set2);

    }
//            addAll(Coll) - объединение множеств
//            retainAll(Coll) - пересеченеи множеств
//            remomeAll(Coll) - разность множеств
//    var a = new HashSet<>(Arrays.asList(1, 2, 3));
//    var b = new HashSet<>(Arrays.asList(1, 2, 3));
//    var c = new HashSet<>(Arrays.asList(1, 2, 3));
    static void methodPut(int x){
        set.put(x, 2);
    }
    static void methodPut1(int x){
        set2.add(x);
    }

}