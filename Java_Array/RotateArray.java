package Java_Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];              //reversing array
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static int[] rotateArr(int[] arr, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);          //left shifting d times

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Unit to rotate: ");
        int d = sc.nextInt();

        System.out.println(Arrays.toString(rotateArr(arr, d)));
    }
}
