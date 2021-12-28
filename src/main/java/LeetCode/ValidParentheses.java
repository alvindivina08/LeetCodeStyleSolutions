package LeetCode;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            return true;
        } else {
            return false;
        }
    }
}
