package Java_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class countDistinct {
    static void Distinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();     //prints distinct elements

        for (int j : arr) {
            set.add(j);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }

    static void findFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {                                         //finds frequency of each item
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,5,6,6,6,6,7,7,7};

        Distinct(arr);
        System.out.println();
        findFrequency(arr);
    }
}
