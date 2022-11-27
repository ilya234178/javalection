
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
                                            //поиск рандомного числа
public class program {
    public static void main(String[] args) {
        int i = ThreadLocalRandom.current().nextInt(-100, 100);
        if (i < 0){
            System.out.println("error\n" + i);

        } else
        System.out.println(i);
        System.out.println(highBit(i));
        System.out.println(arrayMaxValue(i));
        System.out.println(arrayMinValue(i));
    }
                                            //поиск старшего бита выпавшего числа
    public static int highBit(int n) {
        int res = 0;
        while (n != 1) {
            n >>= 1;
            res++;
        }
        return res;
    }
    public static int[] arrayMaxValue(int i) {
        int n = highBit(i);
        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        int[] m1 = new int[count];
        int index = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index] = j;
                index++;
            }
        }
        System.out.print(Arrays.toString(m1));

        System.out.println("\n");
        System.out.println("==============");
        System.out.println(count);

        return m1;
    }
    public static int[] arrayMinValue(int i) {
        int n = highBit(i);
        int count = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n == 0) {
                count++;
            }
        }
        int[] m2 = new int[count];
        int index = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n == 0) {
                m2[index] = j;
                index++;
            }
        }
        System.out.print(Arrays.toString(m2));

        System.out.println("\n");
        System.out.println("==============");
        System.out.println(count);
        return m2;
    }
}


