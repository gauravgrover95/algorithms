/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Arrays;

public class UnionFind {

    private static boolean twoSumNaive(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean twoSumTwoPinters(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int sum = arr[lo] + arr[hi];
            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                lo++;
            }
            else if (sum > target) {
                hi--;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // go left
                hi = mid - 1;
            }
            else if (arr[mid] > key) { // go right
                lo = mid + 1;
            }
        }
        return -1;
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; ++i) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 0, -1, 2, -3, 1 };
        System.out.println("array: " + Arrays.toString(arr));

        // sorted array
        Arrays.sort(arr);
        System.out.println("sorted array: " + Arrays.toString(arr));
        //
        // // reverse sorted array
        // reverse(arr);
        // System.out.println("revserse sorted array: " + Arrays.toString(arr));
        //
        // // test binary search
        // int key = 2;
        // int bs = binarySearch(arr, key);
        // if (bs != -1) {
        //     System.out.println("found at: " + bs);
        // }
        // else {
        //     System.out.println("not found");
        // }

        // two sum
        boolean result = twoSumTwoPinters(arr, -5);
        System.out.println("result: " + result);
    }
}
