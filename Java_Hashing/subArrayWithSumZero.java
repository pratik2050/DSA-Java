package Java_Hashing;

import java.util.HashSet;

public class subArrayWithSumZero {
    static boolean isSum (int[] arr) {
        HashSet<Integer> s = new HashSet<>();

        int prefixSum = 0;

        for (int j : arr) {
            prefixSum = prefixSum + j;

            if (s.contains(prefixSum))
                return true;

            if (prefixSum == 0)
                return true;

            s.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSum(new int[]{1, 2, 13, -3, -10, 5}));
    }
}
