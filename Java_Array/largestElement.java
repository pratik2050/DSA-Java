package Java_Array;

import java.util.Scanner;

public class largestElement {
    static int findMax(int[] arr) {
        int res = 0;
        for (int j : arr) {
            if (j > res) {          //Program to find the largest element in array
                res = j;
            }
        }
        return res;
    }

    static int findSecondMax(int[] arr) {
        int res = -1, largest = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;                       //program to find second largest
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return arr[res];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr));
        System.out.println(findSecondMax(arr));
    }
}
