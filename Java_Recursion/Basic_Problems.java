package Java_Recursion;

import java.util.Scanner;

public class Basic_Problems {
    static void printBoth(int n) {
        /* This function takes an integer as argument and print integers in the following manner
        if n = 3
        the function will print 321123
         */

        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printBoth(n-1);
        System.out.print(n+" ");
    }

    static void printInBinary(int n) {
        /*
        This function take an integer n as input and prints the binary equivalent of n
        if n = 7
        the function will print 111
         */

        if (n == 0) {
            return;
        }
        printInBinary(n/2);
        System.out.print(n%2);
    }

    static void baseConvert(int n, int base) {
        /*
        This function takes an integer(in base 10) as argument and convert it to the passed base
        if n = 5 and base = 3
        This function will print 12
         */

        if (n == 0) {
            return;
        }
        baseConvert(n/base,base);
        System.out.print(n%base);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        printBoth(n);
        System.out.println();
        printInBinary(n);
        System.out.println();

        System.out.println("Enter another number: ");
        int x = sc.nextInt();
        System.out.println("Enter Desired base: ");
        int base = sc.nextInt();
        baseConvert(x, base);
    }
}
