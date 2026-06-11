import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }
    
    private void generate(List<String> result, String current, int left, int right) {
        // If no parentheses left, add to result
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }
        
        // Try adding '(' if available
        if (left > 0) {
            generate(result, current + "(", left - 1, right); // inefficient concatenation
        }
        
        // Try adding ')' if valid
        if (right > left) {
            generate(result, current + ")", left, right - 1); // again inefficient
        }
    }
}

