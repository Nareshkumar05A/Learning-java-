/*
/*Count Primes - 204 */

/*Given an integer n, return the number of prime numbers that are strictly less than n.

Input Format

A single integer n.

Constraints

0 <= n <= 5 * 10⁶

Output Format

Print a single integer: count of prime numbers less than n.

Sample Input 0

10
Sample Output 0

4
Explanation 0

The primes from 1 to 10 are 2, 3, 5, 7. So the total number of primes upto to n(exclusive) is 4. */

import java.io.*;
import java.util.*;

public class Solution {

     public static int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(countPrimes(n));
    }
} */
