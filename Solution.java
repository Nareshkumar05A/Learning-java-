
/*Find Pivot Index - 724 */

/*Given an array of integers nums, find the pivot index.

The pivot index is the index where the sum of all elements to the left is equal to the sum of all elements to the right.

If no such index exists, return -1. If there are multiple pivot indexes, return the leftmost pivot index.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 104 -1000 <= nums[i] <= 1000

Output Format

Print a single integer, the pivot index. If no pivot index is found, print -1.

Sample Input 0

6  
1 7 3 6 5 6 
Sample Output 0

3
Explanation 0

The sum of elements left of index 3 (1 + 7 + 3 = 11) is equal to the sum of elements right of index 3 (5 + 6 = 11). So, pivot index = 3. */

import java.io.*;
import java.util.*;

public class Solution {

    public static int pivot(int[] arr,int n)
    {
        int totalSum = 0;
        int leftSum = 0;
        for(int num : arr)
        {
            totalSum += num;
        }
        for(int i=0;i<n;i++)
        {
            if(leftSum == totalSum - leftSum - arr[i])
            {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print(pivot(arr,n));
    }
}