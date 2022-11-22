package javaproject;
import java.util.Scanner;

// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {
//         System.out.println("bye world");
//     }
    
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);
//         var d = 123.456;
//         System.out.println(d);
//         System.out.println(getType(a));
//         System.out.println(getType(d));
//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s!", name);
        iScanner.close();
    }
}