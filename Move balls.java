/*Move all Balls */

/*You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.

Input Format

The first line of the input contains a string where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball

Constraints

n == boxes.length 1 <= n <= 2000 boxes[i] is either '0' or '1'.

Output Format

Output the Minimum number of operations to move the ball.

Sample Input 0

110
Sample Output 0

1 1 3
Explanation 0

Input: boxes = "110" Output: [1,1,3] Explanation: The answer for each box is as follows: 1) First box: you will have to move one ball from the second box to the first box in one operation. 2) Second box: you will have to move one ball from the first box to the second box in one operation. 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        int count = 0;
        int move = 0;
        int n=str.length();
        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]+=move;
            if(str.charAt(i)== '1')
            {
                count++;
            }
            move += count;
        }
        count = 0;
        move = 0;
        for(int i=n-1;i>=0;i--)
        {
            result[i] += move;
            if(str.charAt(i) == '1')
            {
                count++;
            }
            move+=count;
        }
        for(int ch : result)
        {
            System.out.print(ch+" ");
        }
    }
}