 /*
        ******
        *    *
        *    *
        *    *
        *    *
        ******

import java.util.*;
class Main
{
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*/


/*
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5

 import java.util.*;
class Main
{
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


/*
1
12
123
1234
12345
123456

import java.util.*;
class Main
{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

 /*
        *****
         ****
          ***
           **
            *

 import java.util.*;
 class Main
 {
     public static void main(String[] args) {
         int n=6;
         for(int i=1;i<=n;i++)
         {
             for(int j=0;j<i;j++)
             {
                 System.out.print(" ");
             }
             for(int j=0;j<n-i;j++)
             {
             System.out.print("*");
              }
             System.out.println();
         }
     }
 }
 */

 /*
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14

 import java.util.*;
 class Main
 {
     public static void main(String[] args) {
         int n=6;
         int num=1;
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<i;j++)
             {
                 System.out.print(num+" ");
                 num++;
             }
             System.out.println();
         }
     }
 }
 */

 /*
0 0 0 0 0
0 0 0 0 0
0 0 5 0 0
0 0 0 0 0
0 0 0 0 0

 import java.util.*;
 class Main
 {
     public static void main(String[] args) {
         int n=5;
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(i==n/2&&j==n/2)
                 {
                     System.out.print("5"+" ");
                 }
                 else {
                     System.out.print("0"+" ");
                 }
             }
             System.out.println();
         }
     }
 }

  */


  /*Diogonal pattern */
/*
          1
        1 2 3
      1 2 3 4 5
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10 11
  1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7
      1 2 3 4 5
        1 2 3
          1
           */
          import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value:")
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            
            for(int j=1;j<n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
   1 
  1 2 
 1 2 3 
1 2 3 4 
 1 2 3 
  1 2 
   1 
 */

 public class Main {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=1;i--)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
 *            *
**          **
***        ***
****      ****
*****    *****
******  ******
**************
*****    *****
****      ****
***        ***
**          **
*            * 
 
 */

 
import java.util.*;
class Main {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}

/*
 ******
******
******
******
******
******
 */

 
import java.util.*;
class Mian
{
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*     1 
      1 1 
     1 2 1 
    1 3 3 1 
   1 4 6 4 1 
 */


public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


/* 
1 2 3 4 5  
  2 3 4 5  
    3 4 5  
      4 5  
        5   */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i+1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


/* 
        *    
      * * *  
    * * * * *  
  * * * * * * *  
* * * * * * * * *  

*/

import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  for(int i = 1; i <= n; i++)
  {
      for(int j = 1; j <= n -i; j++)
      {
          System.out.print("  ");
      }
      for(int j = 0; j < 2 * i - 1; j++)
      {
          System.out.print("* ");
      }
      System.out.println();
  }
}
}


