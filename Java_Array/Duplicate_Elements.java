package Java_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_Elements {
    static ArrayList<Integer> removeDuplicate(int[] arr) {
        int res = 1;
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(arr[0]);        //adding the first element
        for (int i=1; i< arr.length; i++) {
            if (arr[i] != arr[res-1]) {
                arr2.add(arr[i]);           //checking if the next element is equal to prev or not;
            }
            res++;
        }
        return arr2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arr2 = removeDuplicate(arr);
        System.out.println(arr2);
    }
}
