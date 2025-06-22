/*Prime Pairs With Target Sum -2761 */

/*You are given an integer n. We say that two integers x and y form a prime number pair if:

1 <= x <= y <= n

x + y == n

x and y are prime numbers

Return the 2D sorted list of prime number pairs [xi, yi]. The list should be sorted in increasing order of xi. If there are no prime number pairs at all, return an empty array.

Note: A prime number is a natural number greater than 1 with only two factors, itself and 1.

leetcode link:- prime paris

Input Format

input should be a number

Constraints

1<=n<=10^5

Output Format

output should be a 2D array of prime pairs

Sample Input 0

10
Sample Output 0

[[3, 7], [5, 5]]
Sample Input 1

2
Sample Output 1

[] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
  
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 2; i < n/2+1; i++) {
            if(prime[i] && prime[n-i]){
                ans.add(Arrays.asList(i, n-i));
            }
        }
        System.out.print(ans);
    }
}