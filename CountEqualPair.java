/*Count Equal and Divisible Pairs in an Array - 2176 */

/*You are given a 0-indexed integer array nums and an integer k.

A pair of indices (i, j) is valid if:

i < j

nums[i] == nums[j]

(i * j) % k == 0

Return the number of valid pairs.

Input Format

Integer array nums of length n (1 <= n <= 100) Integer k (1 <= k <= 100)

Constraints

1 <= nums.length <= 100 1 <= nums[i] <= 100 1 <= k <= 100

Output Format

An integer representing the number of valid (i, j) pairs.

Sample Input 0

7
3 1 2 2 2 1 3
2
Sample Output 0

4
Explanation 0

Valid pairs are: (0,6), (1,5), (2,3), (2,4) */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
