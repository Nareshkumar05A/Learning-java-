/*Tower of Hanoi 46 */

/*The Tower of Hanoi is a mathematical puzzle where you have three rods (A, B, and C) and N disks of different sizes arranged in ascending order on rod A. The goal is to move all the disks from rod A to rod C, following these rules:

RULES Only one disk can be moved at a time. A disk can only be placed on an empty rod or on a larger disk. You can use the auxiliary rod (B) as an intermediate step.

Write a program that prints the steps to solve the Tower of Hanoi for N disks.

Input Format

A single integer N representing the number of disks.

Constraints

1 ≤ N ≤ 12 (Larger values of N would generate too many moves, making it impractical for output.) Moves should be printed in order following the Tower of Hanoi algorithm. The minimum number of moves required is (2ⁿ - 1).

Output Format

Print each move in the format

Move disk from to

Print the total number of moves at the end.

Sample Input 0

3
Sample Output 0

Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
Total moves: 7
Explanation 0

Step-by-Step Explanation for N = 3
1️⃣ Move smallest disk (1) from A → C
A: [3, 2] B: [] C: [1]

2️⃣ Move disk 2 from A → B
A: [3] B: [2] C: [1]

3️⃣ Move disk 1 from C → B (placing it on top of disk 2)
A: [3] B: [2,1] C: []

4️⃣ Move largest disk (3) from A → C
A: [] B: [2,1] C: [3]

5️⃣ Move disk 1 from B → A
A: [1] B: [2] C: [3]

6️⃣ Move disk 2 from B → C
A: [1] B: [] C: [3,2]

7️⃣ Move disk 1 from A → C
A: [] B: [] C: [3,2,1] ✅ (All disks are now in place!)

 */

 import java.io.*;
 import java.util.*;
 
 public class Solution {
    static int count = 0;
     public static void solveHonai(int n, char fromRod, char toRod, char auxRod)
     {
         if(n == 1)
         {
             System.out.println("Move disk 1 from "+ fromRod +" to "+ toRod);
             count++;
             return;
         }
         solveHonai(n - 1, fromRod, auxRod, toRod);
         System.out.println("Move disk "+ n + " from " + fromRod + " to " + toRod);
         count++;
         solveHonai(n - 1, auxRod, toRod, fromRod);
     }
 
     public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         solveHonai(n,'A','C','B');
         System.out.print("Total moves: "+count);
     }
 }