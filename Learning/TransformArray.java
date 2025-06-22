
/*Transform Array by Parity - 3467 */

/*You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:

Replace each even number with 0.

Replace each odd number with 1.

Sort the modified array in non-decreasing order.

Return the resulting array after performing these operations.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 100 1 <= nums[i] <= 1000

Output Format

Print the transformed array as a single line of space-separated integers.

Sample Input 0

4
4 3 2 1
Sample Output 0

0 0 1 1
Explanation 0

Replace even numbers (4 and 2) with 0 and odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].

After sorting in non-decreasing order, nums = [0, 0, 1, 1]. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = scan.nextInt();
            input[i] = (input[i]%2==0) ? 0 : 1;
        }
        Arrays.sort(input);
        for(int num : input)
        {
            System.out.print(num+" ");
        }
    }
}
