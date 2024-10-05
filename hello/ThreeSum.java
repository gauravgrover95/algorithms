/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThreeSum {

    int[] threeSum(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int sum = 0;
            int find = sum - arr[i];

            int lo = i + 1;
            int hi = arr.length - 1;
            boolean found = false;
            while (lo < hi) {
                if (arr[lo] + arr[hi] == find) {
                    found = true;
                    break;
                }
                else if (arr[lo] + arr[hi] > find) {
                    hi--;
                }
                else if (arr[lo] + arr[hi] < find) {
                    lo++;
                }
            }
            // if(found) {
            //     return;
            // }
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }
}
