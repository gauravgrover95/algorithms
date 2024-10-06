/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

    static int[] duplicates(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 3, 6, 1 };
        System.out.println("arr: " + Arrays.toString(arr));

        int[] result = duplicates(arr);
        System.out.println("result: " + Arrays.toString(result));
    }
}