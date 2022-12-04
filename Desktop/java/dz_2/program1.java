public class program1 {
    public static void main(String[] args) {
    task1();
}
    static void task1 () {
        String stringFirst = "найти наименьшее окно в строке";
        String stringSecond = "содержащей все символы окно  другой строке наверное";
        String[] arr1 = stringFirst.split(" ");
        String[] arr2 = stringSecond.split(" ");
        String[] arr3 = new String[arr1.length > arr2.length ? arr1.length : arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].compareTo(arr2[j]) == 0) {
                    arr3[count++] = arr1[i];
                }
            }
        }
        int minLength = 100;
        String result = null;
        for (String each : arr3 ) {
            if (each != null && each.length()<minLength) {
                minLength = each.length();
                result = each;
            }
        }
        System.out.println(result);

    }
}
