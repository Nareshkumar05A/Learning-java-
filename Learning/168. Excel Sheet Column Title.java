/*168. Excel Sheet Column Title */

/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY" */


class Solution {
    public String convertToTitle(int num) {
        StringBuilder result = new StringBuilder();
        while(num > 0)
        {
            num--;
            result.insert(0, (char)('A' + (num % 26)));
            num /= 26;
        }
        return result.toString();
    }
}