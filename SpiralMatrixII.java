/*Spiral Matrix II 1 */

/*Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Input Format

Input: n = 3

Constraints

1100.

Output Format

Output: [[1,2,3],[8,9,4],[7,6,5]]

Sample Input 0

5
Sample Output 0

1 2 3 4 5  
16 17 18 19 6  
15 24 25 20 7  
14 23 22 21 8  
13 12 11 10 9   */

import java.io.*;import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] matrix=new int[n][n];
        int count=1,cls=0,rs=0,re=n-1,cle=n-1;
        while (cls<=cle&&rs<=re)
        {
            for (int i=cls;i<=cle;i++) 
            {
                matrix[rs][i]=count++;
            }
            rs++;
            for (int i=rs;i<=re;i++)
            {
                matrix[i][cle]=count++;
            }
            cle--;
            if (rs<=re)
            {
                for (int i=cle;i>=cls;i--)
                {
                    matrix[re][i]=count++;
                }
                re--;
            }
            if (cls<=cle) {
                for (int i=re;i>=rs;i--)
                {
                    matrix[i][cls]=count++;
                }
                cls++;
            }
        }
        for (int i = 0; i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
