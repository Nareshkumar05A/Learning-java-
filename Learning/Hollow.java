/*Pattern Hollow Diamond */

/*You are given an integer N. Your task is to print a hollow diamond pattern of height 2*N - 1

Input Format

A single integer N representing the number of rows in the upper half of the diamond

Constraints

1 ≤ N ≤ 100

Output Format

Print the hollow diamond pattern using asterisks (*) and spaces.

Each row must be printed on a new line.

There should be no trailing spaces

Sample Input 0

3
Sample Output 0

  *  
 * * 
*   *
 * * 
  *   
  */

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2*(i - 1) - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=N-1;i>=1;i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2*(i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
    }
}
