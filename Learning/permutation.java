/*permutation 27 */

/*Given a string s, return all possible Permutation of the string. The permutations should not contain duplicates if the input has unique characters. If the input has duplicate characters, ensure that permutations are not repeated.

Input Format

input should be a string

Constraints

1<=n<=100

Output Format

output should be a array

Note : If you are still Facing challenges to solve this problem see the reference YTube link not now at home

Sample Input 0

abc
Sample Output 0

[abc, acb, bac, bca, cab, cba] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        List<String>ans=new ArrayList<>();
        List<String>ans1=method(str,"",ans);
        Collections.sort(ans1);
        System.out.println(ans.toString().replace("[", "[").replace("]", "]").replace(", ", "\", \"").replace("[", "[\"").replace("]", "\"]"));
    }
    public static List<String> method(String up,String p,List<String> ans)
    {
        if(up.isEmpty()) 
        {
            ans.add(p);
            return ans;
        }
        char c=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            method(up.substring(1),f+c+s,ans);
        }
        return ans;
        
    }
}