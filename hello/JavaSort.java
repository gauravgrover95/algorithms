/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Arrays;
import java.util.Collections;

public class JavaSort {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 7, 3, 6, 2, 9 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


        // int[] array = { 1, 2, 7, 3, 6, 2, 9 };
        // array = -Arrays.sort(-array);
        // System.out.println(Arrays.toString(array));
    }
}
