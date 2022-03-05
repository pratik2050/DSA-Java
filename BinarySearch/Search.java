package BinarySearch;

public class Search {
    static int iterative(int[] arr, int x) {
        int low = 0, high = arr.length-1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    static int recursive(int[] arr, int l, int h, int x) {
        if (l > h) return -1;

        int mid = (l + h)/2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) {
            return recursive(arr, l, mid-1, x);
        }
        else {
            return recursive(arr, mid+1, h, x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(recursive(arr, 0, arr.length, 3));

        System.out.println(iterative(arr, 7));
    }
}
