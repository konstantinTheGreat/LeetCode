package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20 {
    /* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.*/

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty() && map.containsValue(c) && map.get(stack.peek()) == c ) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
