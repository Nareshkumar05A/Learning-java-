/*Partition Array 1 */

/*You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

Every element less than pivot appears before every element greater than pivot. Every element equal to pivot appears in between the elements less than and greater than pivot. The relative order of the elements less than pivot and the elements greater than pivot is maintained. More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj. Return nums after the rearrangement.

Input Format

The First line of the input contains the size of the array N. The second line of the input contains N space separated integers. And the third line of the input contains a integer pivot element.

Constraints

1 <= nums.length <= 105 -106 <= nums[i] <= 106 pivot equals to an element of nums.

Output Format

Output the new array partitioned according to the pivot element.

Sample Input 0

6
9 12 5 10 14 10
10
Sample Output 0

9 5 10 10 12 14
Explanation 0

5, 9 (less than 10) 10, 10 (equal to 10) 12, 14 (greater than 10)

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        int pivot = scan.nextInt();
        int[] result = new int[n];
        
        int index = 0;
        for(int num : arr)
        {
            if(num < pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num == pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : arr)
        {
            if(num > pivot)
            {
                result[index++] = num;
            }
        }
        
        for(int num : result)
        {
            System.out.print(num+" ");
        }
        
    }
}