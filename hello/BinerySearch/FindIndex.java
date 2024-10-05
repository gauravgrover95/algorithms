//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int key = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            int ar[] = ob.findIndex(nums, key);
            System.out.println(ar[0] + " " + ar[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        int[] res = new int[2];

        boolean found = false;
        int i;
        for (i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                // found first element
                found = true;
                break;
            }
        }
        if (found) {
            res[0] = i;
        }
        else {
            res[0] = -1;
        }

        found = false;
        for (i = arr.length - 1; i >= 0; --i) {
            if (arr[i] == key) {
                // found second elemen
                found = true;
                break;
            }
        }

        if (found) {
            res[1] = i;
        }
        else {
            res[1] = -1;
        }

        return res;
    }
}