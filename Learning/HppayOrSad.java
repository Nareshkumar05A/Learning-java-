/*Happy or Sad 1 */

/*Given N students standing in a row, each student i has an distinct achievement score A[i] provided in an array A=[A1,A2,…,An] The array A consists of distinct integers from 1 to N.

A student i (1≤i≤N ) will be happy if their achievement score A[i]is greater than the achievement scores of all the students standing before them in the array.

The task is to print whether a student is happy or not.

Input Format

Each test case consists of two lines of input.

The first line of each test case contains

 -->N — the number of students.
The second line of each test case contains

 -->N space-separated integers A1,A2,…,AN denoting the achievement scores of the students.
Constraints

1<=N,A[i]<=100

Output Format

For each test case, print a single line containing N integers. Print i'th integer as 1 if the i'th student is happy, otherwise print 0.

Sample Input 0

5
3 1 2 4 5
Sample Output 0

1 0 0 1 1 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            if(arr[j]>max)
            {
                System.out.print("1"+" ");
                max=arr[j];
            }else
            {
                System.out.print("0"+" ");
            }
        }
    }
}