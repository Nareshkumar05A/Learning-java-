/*500. Keyboard Row */

/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]

  */

 class Solution {
    public String[] findWords(String[] words) {
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        List<String> str=new ArrayList<>();
        for(String word : words)
        {
            String lower=word.toLowerCase();
            if(check(lower,first) || check(lower,second) || check(lower,third))
            {
                str.add(word);
            }
        }
        return str.toArray(new String[0]);
    }
    private boolean check(String word, String row)
    {
        for(char c:word.toCharArray())
        {
            if(row.indexOf(c)==-1)
            {
                return false;
            }
        }
        return true;
    }
}