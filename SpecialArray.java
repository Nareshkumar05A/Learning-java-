/*Special array 3 */

/*An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

Note:-

Parity refers to the property of a number being either even or odd.

     -->A number has even parity if it is divisible by 2 (e.g., 2, 4, 6, 8).

     -->A number has odd parity if it is not divisible by 2 (e.g., 1, 3, 5, 7).
Input Format

The first line contains an integer N (1 ≤ N ≤ 100), representing the length of the array.

The second line contains N space-separated integers representing the array elements.

Constraints

1 ≤ N ≤ 100

Output Format

Return true if nums is a special array, otherwise, return false.

Sample Input 0

5
1 2 3 4 5
Sample Output 0

true
Sample Input 1

1
4
Sample Output 1

false
 */

 import java.io.*;
import java.util.*;

public class Solution {

    
    public static boolean special(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            if((nums[i]%2)==(nums[i+1]%2)) {
                return false; 
 
            }
        }
        return true; 
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
          nums[i]=scan.nextInt();
        }
        if(nums.length==1)
        {
            System.out.print("false");
            
        }else{
       
               System.out.print(special(nums));  
        }
        }
    }
