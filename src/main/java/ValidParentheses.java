import java.util.*;

public class ValidParentheses {
    public static final Map<Character, Character> parantheses = new HashMap<Character, Character>() {{
        put(')', '(');
        put(']', '[');
        put('}', '{');
    }};

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (parantheses.values().contains(c)) {
                stack.offer(c);
            } else {
                if (stack.isEmpty() || !stack.pollLast().equals(parantheses.get(c))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
