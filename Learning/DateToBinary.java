/*Convert Date to Binary - 3280 */

/*You are given a date in the format "DD-MM-YYYY". Convert the date into its binary representation without using any built-in functions for integer-to-binary conversion.

Each part of the date should be converted to binary as follows:

Day (DD): Represented in 5 bits (since max 31 → 11111).

Month (MM): Represented in 4 bits (since max 12 → 1100).

Year (YYYY): Full binary representation.

Input Format

A single string date in the format "DD-MM-YYYY".

Constraints

01 <= DD <= 31

01 <= MM <= 12

1900 <= YYYY <= 2100

Output Format

A string representing the binary conversion of the date in "DD-MM-YYYY" format.

Sample Input 0

25-03-2025
Sample Output 0

11001-11-11111101001
Explanation 0

25 → 11001

3 → 11

2025 → 11111101001 */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static String FindBinary(String string)
    {
        int num = Integer.parseInt(string);
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String strs = scan.next();
        StringBuilder result = new StringBuilder();
        String[] str = strs.split("-");
        for(int i = 0; i < str.length; i++)
        {
           result.append(FindBinary(str[i]));
           if(i < str.length - 1)
           {
               result.append("-");
           }
        }
        System.out.print(result.toString());
    }
}