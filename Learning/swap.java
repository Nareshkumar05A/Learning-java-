/*Swap and Flip */

/*Given a binary string S of length N, check if you can transform it to another binary string T (also of length N) by using either of the following operations as many times as needed :

1)Swap Operation:

 i)Pick indices (i,j) such that 1≤i<j≤N.

ii)Swap S[i] and S[j].
2)Flip Operation:

 i)Pick indices (i,j) such that 1≤i<j≤N.

ii)Flip both S[i] and S[j] (0 becomes 1, and 1 becomes 0).  
Input Format

The first line of each test case contains

--> N - the lengths of the string S and T The

second line contains

--> S - a binary string of size N

The third line contains

--> T - a binary string of size N */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String s=scan.nextLine();
        String t=scan.nextLine();
         int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                count++;
            }
        }
        if(count%2==0)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}