package Java_Hashing;

import java.util.HashMap;

public class subArrayWithGivenSum {
    static int maxLen(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0, res = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == sum) {
                res = i+1;
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }

            if (map.containsKey(prefixSum - sum)) {
                res = Math.max(res, i - map.get(prefixSum - sum));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxLen(new int[]{8, 3, 1, 5, -6, 6, 2, 2}, 4));
    }
}
