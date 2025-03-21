import java.util.Stack;

class Solution {
    public String reverseString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "hello";

        System.out.println("Before: " + input);
        String reversed = solution.reverseString(input);
        System.out.println("After: " + reversed); // Output: "olleh"
    }
}

