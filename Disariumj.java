
/*Disarium Number 12 */

/*You are given an integer N. A number is called a Disarium number if the sum of its digits powered with their respective positions is equal to the number itself. Your task is to determine whether the number is Disarium or not.

Input Format

A single integer N

Constraints

1≤N≤10^5

Output Format

Print 1 if the number is a Disarium number Print 0 otherwise

Sample Input 0

89
Sample Output 0

1
Explanation 0

8^1 + 9^2 = 8 + 81 = 89 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int num = 0;
        int i = 1;
        String str = String.valueOf(n);
        int k = str.length();
        while(n != 0)
        {
            int digit = n % 10;
            num += Math.pow(digit,k);
            n /= 10;
            k--;
        }
        //System.out.print(num);
        if(temp == num)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
    }
}
